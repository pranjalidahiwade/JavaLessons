package com.ThisKeywordPrac;
class Test{
    public void display(){
        show();
        System.out.println("In display");
        this.show();
    }
    public void show(){
        System.out.println("In show");

    }
}

public class InvokeMethodProg {
    public static void main(String[] args){
        Test t=new Test();
        t.display();
    }

}
