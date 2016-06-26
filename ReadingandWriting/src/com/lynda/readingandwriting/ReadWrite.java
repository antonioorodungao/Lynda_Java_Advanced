package com.lynda.readingandwriting;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 * Created by Oro on 6/25/2016.
 */
public class ReadWrite {

    public static void main(String[] args) {

        Path source = Paths.get("files\\readwrite\\sample.txt");

        System.out.println(source.getFileName());

        Path target = Paths.get("files\\readwrite\\newfile.txt");
        System.out.println(target);

        Charset charset = Charset.forName("US-ASCII");

        ArrayList<String> lines = new ArrayList<>();

        try(BufferedReader br = Files.newBufferedReader(source, charset)){

            String line = null;
            while ((line = br.readLine())!= null){
                System.out.println(line);
                lines.add(line);

            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try(BufferedWriter bw = Files.newBufferedWriter(target, charset)) {

            for (String line: lines
                 ) {
                 bw.write(line, 0, line.length());
                bw.newLine();
            }
        } catch (IOException e) {
            e.getMessage();
        }

    }
}
