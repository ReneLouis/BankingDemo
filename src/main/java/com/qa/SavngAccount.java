package com.qa;

public class SavngAccount extends BankAccount{
    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        if (interestRate <= 0) throw new IllegalArgumentException("Interest rate must be positive.");
        else this.interestRate = interestRate;
    }

    private double interestRate;

    public SavngAccount(){}

    public SavngAccount(double balance, double minBalance, String accountHolderName, double interestRate){
        super(balance,minBalance,accountHolderName);
        this.interestRate = interestRate;
    }
    public void addInterset(){
        super.setBalance(super.getBalance()*this.interestRate);
    }
}
