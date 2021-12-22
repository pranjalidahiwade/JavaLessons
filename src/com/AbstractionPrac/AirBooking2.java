package com.AbstractionPrac;
interface MakeMyTrip2{
    //void getAvailableSeat();
    void getPrice();
    void getDate();
    void getFlightNo();

    }

interface ThomasCook2{
    void getAvailableSeat();
    void getPrice();
    void getDate();
    void getFlightNo();
}
abstract class AirIndia2 implements MakeMyTrip2,ThomasCook2{

    @Override
    public void getAvailableSeat(){
        System.out.println("Air India-Rates are not available.");
    }



    @Override
    public void getDate() {
        System.out.println("Air India-Dates are not available.");
    }

    @Override
    public void getFlightNo() {
        System.out.println("Air India-Flights are not available.");
    }
}
class GoAir2 implements MakeMyTrip2,ThomasCook2{
    @Override
    public void getAvailableSeat() {
        System.out.println("GoAir- Seats are not available.");
    }

    @Override
    public void getPrice() {
        System.out.println("GoAir-Rates are not available.");
    }

    @Override
    public void getDate() {
        System.out.println("GOAir -Dates are not available.");
    }

    @Override
    public void getFlightNo() {
        System.out.println("GoAir-Flights are not available.");
    }
}
class Indigo2 implements MakeMyTrip2,ThomasCook2{
    @Override
    public void getAvailableSeat() {
        System.out.println("Indigo- Seats are not available.");
    }

    @Override
    public void getPrice() {
        System.out.println("Indigo-Rates are not available.");
    }

    @Override
    public void getDate() {
        System.out.println("Indigo-Dates are not available.");
    }

    @Override
    public void getFlightNo() {
        System.out.println("Indigo-Flights are not available.");
    }

}
public class AirBooking2{
    public static void main(String[] args){
//MakeMyTrip2 ai= new AirIndia2();
MakeMyTrip2 ind=new Indigo2();
ThomasCook2 go=new GoAir2();
//ai.getDate();
go.getAvailableSeat();
go.getFlightNo();
ind.getPrice();

    }
}
