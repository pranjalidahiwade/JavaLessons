package com.SuperKeywordPrac;
class Animal1{
    Animal1(){
        System.out.println("Animal is created");

    }
}
class Dog1 extends Animal1{
    Dog1(){
        System.out.println("Dog is created");
    }

}

public class SuperDefaultConstructor {
    public static void main(String []args){
        Dog1 d=new Dog1();
    }
}
