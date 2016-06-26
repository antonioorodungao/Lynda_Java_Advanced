package com.lynda.enumeration;

/**
 * Created by Oro on 6/24/2016.
 */
public enum OliveName {
    GOLDEN("Golden"), KALAMATA("Kalamata"), LIGURIO("Ligurio"), PICHOLINE("Picholine");

    String nameasString;

    OliveName(String name){
        this.nameasString = name;
    }

    @Override
    public String toString() {
        return nameasString;
    }
}
