package com.lynda.characterstreams;

import java.io.*;

/**
 * Created by Oro on 6/26/2016.
 */
public class MyCharacterStreams {

    public static void main(String[] args) {
        try (
                FileReader in = new FileReader("files/textFile.txt");
                FileWriter out = new FileWriter("files/new.txt");) {
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
