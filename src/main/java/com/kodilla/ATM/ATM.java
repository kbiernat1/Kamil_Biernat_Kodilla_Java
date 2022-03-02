package com.kodilla.ATM;

abstract class ATM {
    abstract protected void insertCard();
    abstract protected void PINcode();
    abstract protected void withdrawedAmount();
    abstract protected void withdrawal();
    abstract protected void thanksForUsing();

    private void processing(){
        System.out.println("Processing...");
    }

    private void fundsBalanceVerification(){
        System.out.println("Checking your balance...");
    }

    private void withdrawalConfirmation(){
        System.out.println("Operation confirmed. Processing withdrawal...");
    }

    public void run(){
        this.insertCard();
        this.PINcode();
        this.withdrawedAmount();
        this.processing();
        this.fundsBalanceVerification();
        this.withdrawalConfirmation();
        this.withdrawal();
        this.thanksForUsing();
    }
}