package com.SuperKeywordPrac;
class Animal{
    String color="black";
    public void eating(){
        System.out.println("Animal is eating");
    }

}
class Dog extends Animal {
    String color = "white";
    public void eating(){
        System.out.println("Dog is eating");
    }
    public void barking(){
        System.out.println("Dog is barking");
    }

    public void show() {
        super.eating();
        System.out.println(super.color);
        System.out.println(color);

    }
}
    public class SuperTest {
    public static void main(String[] args){
        Dog d=new Dog();
        d.show();
       d.eating();
        //Animal a=new Animal();
        //a.eating();
    }

    }

