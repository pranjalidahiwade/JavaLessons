package com.CollectionPrac;

import java.util.HashMap;
import java.util.Map;

public class HashMapProg {
    public static void main(String[]args){
        HashMap<Integer,String> hs=new HashMap<Integer, String>();
        hs.put(1,"one");
        hs.put(2,"two");
        hs.put(3,"three");
        hs.put(4,"five");
        hs.put(4,"four");
        hs.put(null,"pranjal");
        hs.put(null,"prannjl");
        System.out.println(hs.size());
        for(Map.Entry<Integer,String> m:hs.entrySet()){
            System.out.println(m.getKey()+"...."+m.getValue());

        }
        System.out.println("***********");
        hs.putIfAbsent(5,"five");
        for(Map.Entry<Integer,String> m:hs.entrySet()){
            System.out.println(m.getKey()+" ....."+m.getValue());
        }
        System.out.println("***********");
        HashMap<Integer,String> map=new HashMap<Integer,String>();
        map.putAll(hs);
        for(Map.Entry<Integer,String> m:map.entrySet()){
            System.out.println(m.getKey()+"......"+m.getValue());
        }

    }
}
