package com.ThisKeywordPrac;
class Student1{
    String name;
    int rollno;
    String course;
    Student1(String name,int rollno,String course){
        //this(name,rollno);
        this.name=name;
        this.rollno=rollno;
        this.course=course;

    }
    Student1(String name,int rollno){
        this(name,rollno,"IT");
        this.name=name;
        this.rollno=rollno;
    }
public void display(){
        System.out.println(name+" "+rollno+" "+course);
}
}
public class ConstructorChain {
    public static void main(String[]args){

        Student1 s1=new Student1("Pranjali",10,"comp");
        Student1 s2=new Student1("sunny",10);
        //Student1 s2=new Student1("new",11);
s1.display();
s2.display();

    }

}
