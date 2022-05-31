package com.techelevator;

public class CheckingAccount extends BankAccount {

    public CheckingAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }

    public CheckingAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }

    @Override
    public int withdraw(int amountToWithdraw) {
        int overDraftFee = 10;
        int withdrawChecking = getBalance() - amountToWithdraw;

        if(withdrawChecking < 0 && withdrawChecking > -100){
            super.withdraw(overDraftFee);
            super.withdraw(amountToWithdraw);
        } else if(withdrawChecking > 0){
            super.withdraw(amountToWithdraw);
        }
        return getBalance();
    }
}
//If the balance falls below $0.00 but is still greater than -$100.00,
// a $10.00 overdraft fee is also charged against the account.
