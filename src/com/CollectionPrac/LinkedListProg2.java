package com.CollectionPrac;

import java.util.LinkedList;

public class LinkedListProg2 {
    public static void main(String[]args){
        LinkedList<String> l=new LinkedList<String>();
        l.add("one");
        l.add("three");
        l.add("four");
        l.add("two");
        l.add(null);
        l.add(null);
        LinkedList<String> l2=new LinkedList<String>();
        l2.add("one1");
        l2.add("two2");
        l2.add("three3");
        l2.add("four4");

        l.addAll(l2);

        //l2.removeAll(l);
        for(String s: l){
            System.out.println(s);
        }
        System.out.println("**********");
        for (String s:l2)
        {System.out.println(s);
        }
        l2.add("five");
        System.out.println("*********");
       l2.removeAll(l);//****check
        for (String s:l2)
        {System.out.println(s);
        }

    }
}


