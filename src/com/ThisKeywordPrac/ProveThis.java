package com.ThisKeywordPrac;
class Prove{
    public void prove(){
        System.out.println(this);
    }

}

public class ProveThis {
    public static void main(String[] args){
       Prove p=new Prove();
       System.out.println(p);
       p.prove();
    }
}
