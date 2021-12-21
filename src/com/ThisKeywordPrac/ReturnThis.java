package com.ThisKeywordPrac;
class A{
    int v;
    A getA(){
        System.out.println(this);
        System.out.println(v);
        return this;

    }
    void msg()
    {
        System.out.println("Hello java"+this);
    }
}


public class ReturnThis {
    public static void main(String[] args) {
        A a=new A();
        a.getA();
        a.msg();
        //new A().getA().msg();
    }
}
/*
class Fact{
    int f=1;
    public void fact(int n)
    {
    for(int i=1;i<=n;i++) {
        f = f * i;
    }
    //return f;
        //System.out.println("factorial is "+f);
    }
}
class ReturnThis{
    public static void main(String[] args) {
       Fact fa= new Fact();
       fa.fact(5);
       System.out.println("factorial is "+fa.f);
    }

}*/
