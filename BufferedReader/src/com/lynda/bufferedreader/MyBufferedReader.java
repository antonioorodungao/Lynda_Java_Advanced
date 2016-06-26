package com.lynda.bufferedreader;

import java.io.*;

/**
 * Created by Oro on 6/26/2016.
 */
public class MyBufferedReader {

    public static void main(String[] args) {
        try (
                BufferedReader in = new BufferedReader(new FileReader("files/textFile.txt"));
                BufferedWriter out = new BufferedWriter(new FileWriter("files/new.txt"));){
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
