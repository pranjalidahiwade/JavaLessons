package com.EncapsulationPrac;

public class AccountJava {
    private long acctno;
    private int amount;

    public long getAcct(){
        return acctno;
    }
    public void setAcct(long acctno){
        this.acctno=acctno;

    }

    public int getAmount(){
        return amount;

    }
    public void setAmount(int amount){
        this.amount=amount;
    }
}
