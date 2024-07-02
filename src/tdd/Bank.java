package tdd;

import java.lang.reflect.UndeclaredThrowableException;
import java.util.ArrayList;
import java.util.Arrays;


public class Bank {


    private final ArrayList<Account> accountList = new ArrayList<>();

    public int checkNumberOfAccountInBank() {
        return accountList.size();
    }

    public void addCustomer(String accountName, String phoneNumber, String pin) {
        String accountNumber = generateAccountNumber(phoneNumber);
        Account account = new Account(accountName, accountNumber, pin);
        accountList.add(account);
    }

    private String generateAccountNumber(String contactNumber) {
        contactNumber = contactNumber.substring(1);
        return contactNumber;
    }

    public double checkBalance(String accountNumber, String pin) {
        Account accountFound = findAccount(accountNumber);
        double balance = 0.00;
        if(accountFound.validatePin(pin)){
        balance = accountFound.checkBalance();}
        return balance;
    }

    private Account findAccount(String accountNumber) {
        for(Account  account : accountList){
            boolean accountFoundMatches = account.getAccountNumber().matches(accountNumber);
            if(accountFoundMatches){
                return account;
            }
        }
        throw new IllegalArgumentException("Wrong Account Number");
    }

    public void deposit(String accountNumber, int amount) {
        Account account = findAccount(accountNumber);
        account.deposit(amount);
    }

    public void withdraw(String accountNumber, int amount, String pin) {
        Account account = findAccount(accountNumber);
        account.withDraw(amount);
    }

    public void transfer(String senderAccountNumber, String receiverAccountNumber, int amount, String pin) {
        Account senderAccount = findAccount(senderAccountNumber);
        Account receiverAccount = findAccount(receiverAccountNumber);
        senderAccount.withDraw(amount);
        receiverAccount.deposit(amount);
    }

    public void closeAccount(String accountNumber, String pin) {
        Account accountToBeClosed = findAccount(accountNumber);

        if(accountToBeClosed.validatePin(pin)){accountList.remove(accountToBeClosed);}

    }

    public void changePin(String accountNumber, String oldPin, String newPin) {
        Account accountFound = findAccount(accountNumber);
        if(accountFound.validatePin(oldPin)){accountFound.setNewPin(newPin);}

    }

}