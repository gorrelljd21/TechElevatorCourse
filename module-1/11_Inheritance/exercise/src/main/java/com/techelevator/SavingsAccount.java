package com.techelevator;

public class SavingsAccount extends BankAccount{

    public SavingsAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }

    public SavingsAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }

    @Override
    public int withdraw(int amountToWithdraw) { //amountToWithDraw = 50
        int serviceFee = 2;
        int withdrawSavings = getBalance() - amountToWithdraw; // 200 - 50 = 150

        if (withdrawSavings < 150) { // withdrawSavings = 150 < 150 = false
            int withdrawSavingsAndServiceFee = withdrawSavings - serviceFee; // 200 (50 + 2) = 148
            if(withdrawSavingsAndServiceFee < 0) {
                return getBalance();
            }
            super.withdraw(serviceFee);
            super.withdraw(amountToWithdraw);
        } else { // withdrawSavings = 150 > 150 = false
            super.withdraw(amountToWithdraw);
        }
        return getBalance();
    }
}
//If the remaining balance is less than $150.00 after a withdrawal is made,
// an additional $2.00 service charge is withdrawn from the account.

//    @Override
//    public int withdraw(int amountToWithdraw) {
//        int overDraftFee = 10;
//        int withdrawChecking = getBalance() - amountToWithdraw;
//
//        if(withdrawChecking < 0 && withdrawChecking > -100){
//            super.withdraw(overDraftFee);
//            super.withdraw(amountToWithdraw);
//        } else if(withdrawChecking > 0){
//            super.withdraw(amountToWithdraw);
//        }
//        return getBalance();
//    }
