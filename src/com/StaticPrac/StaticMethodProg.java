package com.StaticPrac;
class Student{
    int rollno;
    String name;
    static String college="IIT";
    Student(int rollno,String name){
        this.rollno=rollno;
        this.name=name;
    }
    static void change(){
        college="MIT";//check??
    }
    public void display(){
        System.out.println(rollno+" "+name+" "+college);
    }
}

public class StaticMethodProg {
    public static void main(String[]args){
        Student.change();
        Student s1=new Student(10,"pranjali");
        Student s2=new Student(11,"ishan");
        s1.display();
        s2.display();
    }
}
