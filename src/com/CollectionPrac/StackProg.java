package com.CollectionPrac;

import java.util.Iterator;
import java.util.Stack;

public class StackProg {
    public static void main(String[]args){
        Stack<String> s=new Stack<String>();
        s.push("one");
        s.push("one");
        s.push("two");
        s.push("three");
        s.push(null);
        s.push(null);
        s.push("four");

        Iterator<String> i=s.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
        System.out.println("**********");
        System.out.println(s.pop());
        System.out.println("**********");
        for(String st: s){
            System.out.println(st);
        }


    }
}
