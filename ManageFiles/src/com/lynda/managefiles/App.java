package com.lynda.managefiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * Created by Oro on 6/25/2016.
 */
public class App {

    public static void main(String[] args) throws IOException {
        Path source = Paths.get("files\\loremipsum.txt");
        System.out.println(source.getFileName());

        if(Files.exists(source)) {
            Path target = Paths.get("files\\loremipsum_copy.txt");
            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
        }

        Path toDelete = Paths.get("files\\toDelete.txt");
        if(Files.exists(toDelete)) {
            Files.delete(toDelete);
            System.out.println("Files deleted");
        }

        Path newDir = Paths.get("files\\newDir");
        Files.createDirectory(newDir);

        Files.move(source, newDir.resolve(source.getFileName()),
                StandardCopyOption.REPLACE_EXISTING);


    }
}
