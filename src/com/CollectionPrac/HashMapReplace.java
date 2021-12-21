package com.CollectionPrac;

import java.util.HashMap;
import java.util.Map;

public class HashMapReplace {
    public static void main(String[]args){
        HashMap<Integer,String> hs=new HashMap<Integer,String>();
        hs.put(1,"one");
        hs.put(2,"two");
        hs.put(3,"three");
        hs.put(4,"four");
        System.out.println("initial list:");
        for(Map.Entry<Integer,String> m:hs.entrySet()){
            System.out.println(m.getKey()+"....."+m.getValue());
        }
        System.out.println("*********");
        //hs.replace(1,"oneone");
        //hs.replace(2,"two","twotwo");
        hs.replaceAll((k,v)->"one");
        for(Map.Entry<Integer,String> m:hs.entrySet()){
            System.out.println(m.getKey()+"....."+m.getValue());
        }

        /*System.out.println("initial list:"+hs);
        hs.remove(1);
        System.out.println("after remove by key"+hs);
        hs.remove("four");//can not remove by value
        System.out.println("after remove by value"+hs);
        hs.remove(4,"four");
        System.out.println(hs);*/


    }
}
