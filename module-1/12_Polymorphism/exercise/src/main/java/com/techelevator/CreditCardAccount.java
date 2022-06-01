package com.techelevator;

public class CreditCardAccount implements Accountable{

    private String accountHolder;
    private String accountNumber;
    private int debt;

    public CreditCardAccount(String accountHolder, String accountNumber){
//        super(accountHolder, accountNumber);
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }

    @Override
    public int getBalance() {
        return getDebt() * -1;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getDebt() {
        return debt;
    }
// Removes amountToPay from the amount owed and returns the new total amount owed.
    public int pay(int amountToPay){
        debt = getBalance() - amountToPay;
        return debt;
    }

// Adds amountToCharge to the amount owed, and returns the new total amount owed.
    public int charge(int amountToCharge){
        debt = getBalance() + amountToCharge;
        return debt;
    }

}

