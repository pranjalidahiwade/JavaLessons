package com.LogicProg;
import java.util.*;
public class Prime2 {
    public static void main(String [] args) {
        System.out.println("enter number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        primeCalc(n);
    }
        static void primeCalc(int num){
         int count=0;
         for(int i=1;i<=num;i++){
             if(num%i==0){
                 count++;
             }
         }
         if (count==2){
             System.out.println("number is prime number");

            }else{
             System.out.println("not prime number");
            }
        }
    }

