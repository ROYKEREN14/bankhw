package com.company;

public class Account implements iAccount{
    protected double CurrentBalance;
    protected int AccountNumber;
    protected double creditLimit;

    public Account(int AccountNumber, double creditLimit) {
        this.AccountNumber = AccountNumber;
        this.creditLimit = creditLimit;
        this.CurrentBalance = 0;

      }


    @Override
    public double withdrew(double amount) {
        if (this.CurrentBalance - amount < this.creditLimit && this.CurrentBalance != this.creditLimit) {
            double stan = this.CurrentBalance + -this.creditLimit;
            this.CurrentBalance = -stan;
            return stan;

        } else if (this.CurrentBalance == this.creditLimit) {
            return 0.0;

        } else {
            this.CurrentBalance -= amount;
            return amount;



        }
    }

    @Override
    public double getCurrentBalance() {
        return this.CurrentBalance;

    }

    @Override
    public int getAccountNumber() {
        return this.AccountNumber;

    }

    @Override
    public void Deposit(double amount) {
        this.CurrentBalance += amount;


    }

}





