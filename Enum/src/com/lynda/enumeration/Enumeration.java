package com.lynda.enumeration;

/**
 * Created by Oro on 6/24/2016.
 */
public class Enumeration {

    public static void main(String[] args) {

        OliveJar oj = new OliveJar();

        oj.addOlive(OliveName.KALAMATA, OliveColor.GREEN);
        oj.addOlive(OliveName.LIGURIO, OliveColor.BLACK);
        oj.addOlive(OliveName.PICHOLINE, OliveColor.YELLOW);
        oj.reportOlives();

    }
}
