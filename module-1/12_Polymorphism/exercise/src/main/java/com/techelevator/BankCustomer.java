package com.techelevator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class BankCustomer {

    private String name;
    private String address;
    private String phoneNumber;
    private List<Accountable> accounts = new ArrayList<>(0);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    //Returns an array of the customer's accounts.
    public Accountable[] getAccounts(){
        return accounts.toArray(new Accountable[0]);

    }

    // Adds newAccount to the customer's list of accounts.
    public void addAccount(Accountable newAccount){
        accounts.add(newAccount);
    }

    public boolean isVip() {
        int totalAccountBalance = 0;
        for(Accountable account : accounts) {
            totalAccountBalance = totalAccountBalance + account.getBalance();
        }
        if(totalAccountBalance >= 25000){
            return true;
        }
        return false;
    }

//    Customers whose combined account balances (credits minus debts) -> balance - debt
//    are at least >= $25,000 are considered VIP customers. = true

//    Add a method called isVip to the BankCustomer class that returns true if the sum
//    of all accounts belonging to the customer is at least $25,000 and false otherwise.
}