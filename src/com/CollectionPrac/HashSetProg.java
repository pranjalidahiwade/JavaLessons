package com.CollectionPrac;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetProg {
    public static void main(String[]args){
        HashSet<String> hs=new HashSet<String>();
        hs.add("one");
        hs.add("twoo");
        hs.add("three");
        hs.add("three");
        hs.add(null);
        hs.add(null);

        Iterator<String> itr=hs.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
