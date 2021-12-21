package com.AbstractionPrac;
interface MakeMyTrip{
    //void getAvailableSeat();
    void getPrice();
    void getDate();
    void getFlightNo();

    }

interface ThomasCook{
    void getAvailableSeat();
    void getPrice();
    void getDate();
    void getFlightNo();
}
abstract class AirIndia implements MakeMyTrip,ThomasCook{

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
class GoAir implements MakeMyTrip,ThomasCook{
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
class Indigo implements MakeMyTrip,ThomasCook{
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
public class AirBooking {
    public static void main(String[] args){
//MakeMyTrip ai= new AirIndia();
MakeMyTrip ind=new Indigo();
ThomasCook go=new GoAir();
//ai.getDate();
go.getAvailableSeat();
go.getFlightNo();
ind.getPrice();

    }
}
