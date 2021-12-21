package com.ExceptionPrac;

public class ExceptionProg {
    public static void main(String[] args) {
        try {
            //String s=null;
            //System.out.println(s.length());
            //int data = 100 / 0;
            int a[]=new int[5];
            a[50]=10;
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
        System.out.println("rest of the code");
    }
}
