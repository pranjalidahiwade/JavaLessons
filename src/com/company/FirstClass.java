package com.company;

import java.util.Scanner;

public class FirstClass {
    public static void main(String[] args){


        System.out.println("Env--"+args[0]);
        System.out.println("Browser"+args[1]);
Scanner sc= new Scanner(System.in);
System.out.println("Enter Script name");
String scriptName=sc.next();
System.out.println("enter script no");
int scriptNo=sc.nextInt();
System.out.println("Script name is "+scriptName);
System.out.println("Script no is" + scriptNo);

    }
}
