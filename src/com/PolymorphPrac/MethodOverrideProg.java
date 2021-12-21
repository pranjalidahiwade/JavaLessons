package com.PolymorphPrac;
class Bank{
    int getROI(){
    return 0;
}
}
class ICICI extends Bank{
    int getROI(){
        return 7;
    }
}
class Axis extends Bank{
    int getROI(){
        return 8;
    }

}
class SBI extends Bank{
    int getROI(){
        return 9;
    }

}
public class MethodOverrideProg {
    public static void main(String [] args){
        Axis a= new Axis();
        ICICI i=new ICICI();
        SBI s=new SBI();
        System.out.println("AXIS roi " +a.getROI());
        System.out.println("ICIC roi " +i.getROI());
        System.out.println("SBI roi " +s.getROI());

    }
}
