package com.lynda.collection.olives;


/**
 * Created by Oro on 6/24/2016.
 */
public class Olive implements Comparable<Olive>{

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

    @Override
    public int compareTo(Olive o) {
        // 0 = equal
        // -1 = smaller than
        // 1 = greater than

        String s1 = this.getClass().getSimpleName();
        String s2 = o.getClass().getSimpleName();

        return s1.compareTo(s2);
    }
}


