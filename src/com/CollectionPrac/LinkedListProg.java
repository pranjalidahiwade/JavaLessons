package com.CollectionPrac;

import java.util.LinkedList;

public class LinkedListProg {
    public static void main(String[]args){
        LinkedList<String> l=new LinkedList<String>();
        l.add("one");
        l.add("three");
        l.add("four");
        l.add("two");
        l.add(null);
        l.add(null);
        LinkedList<String> l2=new LinkedList<String>();
        l2.addAll(l);
       /* for (String s:l2) {
            System.out.println(s);
        }*/
        l.addAll(l2);

        //l2.removeAll(l);
        for(String s: l){
            System.out.println(s);
        }
        l.removeAll(l2);
        for (String s:l2)
              {System.out.println(s);

        }




    }
}
