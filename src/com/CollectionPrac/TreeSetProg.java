package com.CollectionPrac;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetProg {
    public static void main(String[] args){
        TreeSet<String> l=new TreeSet<String>();
        l.add("one");
        l.add("twoo");
        l.add("three");
        l.add("three");
        /*l.add(null);
        l.add(null);*/

       /* Iterator<String> i= l.descendingIterator();
        while(i.hasNext()){
            System.out.println(i.next());*/
        for(String s: l.descendingSet()){
            System.out.println(s);
        }
    }
}
