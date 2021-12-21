package com.StaticPrac;
class Counter{
    static int count=0;
    Counter(){
        count++;
        System.out.println(count);
    }
}

public class StaticTest {
    public static void main(String[]args){
        Counter c1=new Counter();
        Counter c2=new Counter();
        Counter c3=new Counter();
        //System.out.println(Counter.count);
    }
}
