package com.lynda.filefinder;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;

/**
 * Created by Oro on 6/25/2016.
 */
public class MyFileFinder extends SimpleFileVisitor<Path> {
    private PathMatcher matcher;

    public ArrayList<Path> foundPaths = new ArrayList<>();

    public MyFileFinder(String pattern){
        matcher = FileSystems.getDefault().getPathMatcher("glob:" + pattern);
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        Path name = file.getFileName();
        System.out.println("Examining :" + name);

        if(matcher.matches(name)){
            foundPaths.add(file);
        }
        return FileVisitResult.CONTINUE;

    }

    public static void main(String[] args) throws IOException {
        Path fileDir = Paths.get("files");

        MyFileFinder myFileFinder = new MyFileFinder("loremipsum.txt");
        Files.walkFileTree(fileDir,myFileFinder);
        ArrayList<Path> foundFiles = myFileFinder.foundPaths;
        if(foundFiles.size() > 0){
            for (Path p: foundFiles
                 ) {
                System.out.println(p.toRealPath(LinkOption.NOFOLLOW_LINKS));

                try(BufferedReader br = Files.newBufferedReader(p, Charset.forName("US-ASCII"))){
                    String line;
                    while((line = br.readLine()) != null){
                        System.out.println(line);
                    }
                }

            }
        }else{
            System.out.println("No files were found.");
        }
    }
}
