package com.lynda.directorytree;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * Created by Oro on 6/25/2016.
 */
public class MyFileVisitor extends SimpleFileVisitor<Path> {
    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        System.out.println("About to visit " + dir);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        if(attrs.isRegularFile()){
            System.out.print("Regular file: ");
        }
        System.out.println(file);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        System.err.print(exc.getMessage());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        System.out.println("Just visited " + dir);
        return FileVisitResult.CONTINUE;
    }

    public static void main(String[] args) throws IOException {
        Path fileDir = Paths.get("files");
        MyFileVisitor myFileVisitor = new MyFileVisitor();
        Files.walkFileTree(fileDir,myFileVisitor);
    }
}
