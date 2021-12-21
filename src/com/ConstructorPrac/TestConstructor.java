package com.ConstructorPrac;
import java.util.Dictionary;

class Animal {
    Animal() {
        System.out.println("in animal constructor");
    }
}
class Dog11 extends Animal{
    Dog11(){
        System.out.println("in Dog constructor");
    }
    }

public class TestConstructor{
    public static void main(String[]args){
        TestConstructor t=new TestConstructor();
        Dog11 d=new Dog11();
    }
}
