package com.lynda.olivepress;

import com.lynda.enumeration.OliveName;
import com.lynda.enumeration.OliveColor;

import java.util.ArrayList;

/**
 * Created by Oro on 6/24/2016.
 */
public class OliveJar {

    public ArrayList<Olive> olives = new ArrayList<Olive>();

    {
        olives.add(new Olive(OliveName.GOLDEN, OliveColor.GOLDEN));
        olives.add(new Olive(OliveName.GOLDEN, OliveColor.GOLDEN));

    }

    public OliveJar(){
        System.out.println("Olive jar constructor.");
    }

    @Override
    public String toString() {
        String val = "";
        for (Olive o: olives
             ) {
            val = val + " " + o.toString();

        }
        return  val;
    }
}
