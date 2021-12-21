package com.ThisKeywordPrac;
class Student{
    String name;
    int rollno;
    Student(){
        name="sunny";
        rollno=10;
    }
    Student(String name,int rollno){
        this.name=name;
        this.rollno=rollno;
    }
public void show(){
        System.out.println(name+" "+rollno);
}
}
public class TestThis {
public static void main(String[]args){
    Student t=new Student("Pranjali",10);
    Student s=new Student();
    s.show();
    t.show();

}
}
