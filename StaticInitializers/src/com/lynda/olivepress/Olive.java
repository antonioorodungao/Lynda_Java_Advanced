package com.lynda.olivepress;

import com.lynda.enumeration.OliveColor;
import com.lynda.enumeration.OliveName;

/**
 * Created by Oro on 6/24/2016.
 */
public class Olive {

    OliveName name;
    OliveColor color;

    public Olive(OliveName name, OliveColor color){
        this.name = name;
        this.color = color;

    }

    public Olive(){
        System.out.println("Olive constructor...");
    }

    @Override
    public String toString() {
        return name + " " + color;
    }
}


