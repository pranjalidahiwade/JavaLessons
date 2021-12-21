package com.CollectionPrac;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetProg {
    public static void main(String[]args){
        LinkedHashSet<String> l=new LinkedHashSet<String>();
        l.add("one");
        l.add("twoo");
        l.add("three");
        l.add("three");
        l.add(null);
        l.add(null);
        for(String s:l){
            System.out.println(s);
        }

       /* Iterator<String> itr=l.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }*/
    }
}
