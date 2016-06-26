package com.lynda.scanner;

import java.io.*;
import java.util.Scanner;

import static java.lang.System.in;

/**
 * Created by Oro on 6/26/2016.
 */
public class MyScanner {

    public static void main(String[] args) {
        try (Scanner s = new Scanner(new BufferedReader(new FileReader("files/textFile.txt")));) {

            while (s.hasNext()) {
                System.out.println(s.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
