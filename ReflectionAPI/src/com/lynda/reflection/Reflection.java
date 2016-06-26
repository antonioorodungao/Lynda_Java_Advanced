package com.lynda.reflection;

import com.lynda.enumeration.Olive;
import com.lynda.enumeration.OliveColor;
import com.lynda.enumeration.OliveName;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by Oro on 6/24/2016.
 */
public class Reflection {

    public static void main(String[] args) {
        Olive o = new Olive(OliveName.PICHOLINE, OliveColor.BLACK);

        Class<?> c = o.getClass();
        System.out.println(c);
        System.out.println(c.getName());
        System.out.println(c.getSimpleName());

        Constructor<?>[] cons = c.getConstructors();

        System.out.println("Number of constructors: " + cons.length);

        Constructor<?> con = cons[0];

        Object obj = null;
        try {
            obj = con.newInstance(OliveName.PICHOLINE, OliveColor.YELLOW);
            System.out.println(obj);
        } catch (InstantiationException e) {
            e.getMessage();
        } catch (IllegalAccessException e) {
            e.getMessage();
        } catch (InvocationTargetException e) {
            e.getMessage();
        }

        Ligurio l = new Ligurio();
        Class<?> c2 = l.getClass();
        System.out.println(c2);

        Class<?> sup = c2.getSuperclass();
        System.out.println("Super class of Ligurio: " + sup);

        Class<?> top = sup.getSuperclass();
        System.out.println("Top name: " + top.getName());

        Package p = c.getPackage();
        System.out.println("Package: " + p.getName());
    }

}
