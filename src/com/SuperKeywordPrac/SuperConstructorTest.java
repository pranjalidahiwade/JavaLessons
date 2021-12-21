package com.SuperKeywordPrac;
class Person{
    int id;
    String name;
    Person(int id,String name){
        this.id=id;
        this.name=name;
    }

}
class Employee extends Person{
    int sal;
    Employee(int id,String name,int sal){
        super(id,name);
        this.sal=sal;
    }
    public void show(){
        System.out.println(id+" "+name+" "+sal);
    }

}

public class SuperConstructorTest {
    public static void main (String[] args){
        Employee e=new Employee(1,"Ishan",10000);
        e.show();
    }
}
