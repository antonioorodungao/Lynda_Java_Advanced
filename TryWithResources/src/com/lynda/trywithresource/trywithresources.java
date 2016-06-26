package com.lynda.trywithresource;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Oro on 6/25/2016.
 */
public class trywithresources {
    public static void main(String[] args) throws IOException {
        try (
                FileReader fr = new FileReader("ATextFile.txt");
                BufferedReader br=new BufferedReader(fr);
        ){
            String s;
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }

        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Still Alive!!!");
    }



}
