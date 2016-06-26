package com.lynda.collection.olives.hashSet;

import com.lynda.collection.olives.Kalamata;
import com.lynda.collection.olives.Ligurio;
import com.lynda.collection.olives.Olive;
import com.lynda.collection.olives.Picholine;

import java.util.HashSet;
import java.util.TreeSet;

/**
 * Created by Oro on 6/24/2016.
 */
public class UseTreeSet {

    public static void main(String[] args) {

        Olive kalamata = new Kalamata();
        Olive ligurio = new Ligurio();
        Olive picholine = new Picholine();

        HashSet<Olive> oliveHashSet = new HashSet();
        oliveHashSet.add(kalamata);
        oliveHashSet.add(ligurio);
        oliveHashSet.add(picholine);

//        System.out.println("Total olives:" + oliveHashSet.size());
//        for (Olive o: oliveHashSet
//             ) {
//            System.out.println(o);
//
//        }

        TreeSet<Olive> oliveTreeSet = new TreeSet<Olive>();
        oliveTreeSet.add(kalamata);
        oliveTreeSet.add(ligurio);
        oliveTreeSet.add(picholine);

        System.out.println(oliveTreeSet);
        System.out.println(oliveHashSet);

    }
}
