package com.CollectionPrac;

import java.util.*;

public class ArrayListProg {
    public static void main(String[]args){
        ArrayList<String> al=new ArrayList<String>();
        al.add("one");
        al.add("two");
        al.add("three");
        al.add("four");
        al.add("four");
        al.add(null);
        al.add(null);
        al.remove(4);
        System.out.println(al.get(4));
        /*Iterator<String> it=al.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }*/

    }
}
