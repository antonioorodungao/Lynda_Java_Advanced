package com.lynda.collection.olives.linkedList;

import com.lynda.collection.olives.Kalamata;
import com.lynda.collection.olives.Ligurio;
import com.lynda.collection.olives.Olive;
import com.lynda.collection.olives.Picholine;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by Oro on 6/24/2016.
 */
public class UseLinkedList {

    public static void main(String[] args) {
        LinkedList<Olive> list  = new LinkedList<Olive>();

        list.add(new Picholine());
        list.add(0, new Kalamata());
        list.addFirst(new Ligurio());

        System.out.println(list);

        Olive o_peek = list.peek();
        System.out.println(o_peek);

        Olive o_pull = list.poll();
        System.out.println(o_pull);

        list.offer(o_pull);

        display(list);
    }

    static private void display(Collection<Olive> col){
        System.out.println("List Order");
        Iterator<Olive> iterator = col.iterator();

        while(iterator.hasNext()){
            Olive olive = (Olive) iterator.next();
            System.out.println(olive.toString());
        }

    }
}
