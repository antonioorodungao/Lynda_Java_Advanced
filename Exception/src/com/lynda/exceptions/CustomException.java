package com.lynda.exceptions;

import com.lynda.exceptions.util.MyFileReader;
import com.lynda.exceptions.exceptions.WrongFileException;

import java.io.IOException;

/**
 * Created by Oro on 6/25/2016.
 */
public class CustomException {

    public static void main(String[] args) throws IOException {
        String fileContents = new MyFileReader().readFile("C:\\Users\\Oro\\Documents\\Projects\\Lynda_Java_Advanced\\Exception\\src\\com\\lynda\\exceptions\\textfile1.txt");
        System.out.println(fileContents);
        try{
        if(fileContents.equals("Right file")){
            System.out.println("You chose the right file");
        }else{
            throw new WrongFileException();
        }}catch (WrongFileException e){
            System.out.println(e.getMessage());
        }
    }
}
