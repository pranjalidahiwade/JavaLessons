package com.StaticPrac;
class Addition{
    int add;
    public static void add(){
        System.out.println(10+20);
        Addition a1=new Addition();
        a1.substraction();

    }
    public static void add(int a,int b){
        System.out.println(a+b);
    }
    public void substraction(){
        System.out.println(20-10);
        add(5, 6);
    }
}


public class StaticMethodProg2 {
    public static void main(String[]args){
        Addition.add();
       // Addition.add(5,6);
    }
}
