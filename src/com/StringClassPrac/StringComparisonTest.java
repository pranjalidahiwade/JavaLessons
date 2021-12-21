package com.StringClassPrac;

public class StringComparisonTest {
    public static void  main(String[]args){
        String s1="Ishan";
        String s2="Ishan";
        String s3=new String ("Ishan");
        String s4="parwe";
        String s5=  new String("ISHAN");
        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s3));//true
        System.out.println(s1==s2);//true
        System.out.println(s1==s3);//false
        System.out.println(s1.compareTo(s2));//0 as it is equal
        System.out.println(s4.compareTo(s1));//-ve value as s1<s4 or +ve value if s4>s1
        System.out.println(s1.equalsIgnoreCase(s5)); //true
        System.out.println(s1.equals(s5));//false


    }
}
