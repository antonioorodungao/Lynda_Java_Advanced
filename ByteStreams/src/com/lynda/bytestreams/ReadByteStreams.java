package com.lynda.bytestreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Oro on 6/26/2016.
 */
public class ReadByteStreams {
    public static void main(String[] args) {
        try (
                FileInputStream in = new FileInputStream("files/textFile.txt");
                FileOutputStream out = new FileOutputStream("files/new.txt");) {
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

