package com.EncapsulationPrac;

public class TestAccount {
    public static void main(String[] args)
    {
        AccountJava a=new AccountJava();
    a.setAcct(26374673);
    a.setAmount(87385);
    System.out.println("Account no is "+a.getAcct()+" and amount is "+a.getAmount());
    }
}
