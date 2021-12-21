package com.PolymorphPrac;

class Animal {
    public void eating(){
        System.out.println("Animal is eating");
    }
    public void roaring(){
        System.out.println("Animal is roaring");
    }
}
class Dog extends Animal{
    public void eating(){
        System.out.println("Dog is eating");
    }
}
/*class Babydog extends Animal{
    public void eating(){
        System.out.println("Babydog is eating");
    }
}*/
class Babydog extends Dog{
    public static void main(String[]args){
//Dog d=new Dog();
//d.eating(10);

Animal b=new Babydog();
b.eating();

}
}
