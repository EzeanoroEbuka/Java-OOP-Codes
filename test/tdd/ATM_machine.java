package tdd;

import java.util.Scanner;

public class ATM_machine {

    private static final Bank access  = new Bank();

    public static void main(String... args) {

            printATMMenu();

        }
    private static void printATMMenu() {

        print("""
:::::::::::::::::::::::::::::::
:: WELCOME TO ACCESS BANKING ::
:::::::::::::::::::::::::::::::

Hello....
You Can Start By creating A New Account With us today.....

1.Create A New Account
2.Close Account
3.Deposit Money
4.Withdraw Money
5.Check Account Balance
6.Transfer From one account to another
7.Change Pin
0.Exit
    
    """);
        char navigator = input(" ").charAt(0);
        switch(navigator) {
            case '1' -> createAnAccount();
            case '2' -> closeAccount();
            case '3' -> depositMoney();
            case '4' -> withdrawMoney();
            case '5' -> checkAccountBalance();
            case '6' -> transferTOOtherAccount();
            case '7' -> changePin();
            case '0' -> exitProgram();
            default -> printATMMenu();
        }
    }

    private static void print(String input){
        System.out.println(input);
    }

    private static String input(String prompt){
       print(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();

    }
    private static void createAnAccount() {

        String firstName = input("Enter your First Name For THis Account");

        String lastName = input("Enter your Last Name For THis Account");

        String phoneNumber = input("Enter your Phone Number For THis Account");

        String newPin = input("Create A New  Four Digit Pin For THis Account SetUp");

        access.addCustomer(firstName + " " + lastName, phoneNumber, newPin);

        String accountNumber = phoneNumber.substring(1);

        print("Saving >>>>>>>>>>>>>>>>>>>>");
        print("Account Created Successfully");
        print("Your New Account Number Is " + accountNumber + "  :)");
        print("");
        printATMMenu();

    }
    private static void closeAccount() {

        String accountNumber = input("Enter your Account Number For The Account to be closed");


        String accountPin = input("Enter your Pin For THis Account");

        access.closeAccount(accountNumber, accountPin);

        print("Account Successfully Closed \n");printATMMenu();
    }

    private static void depositMoney(){

        String receiverAccountNumber = input("Enter The Receiver Account Number For deposit");

        int amount = Integer.parseInt(input("Enter The Amount To Be Deposited"));

        access.deposit(receiverAccountNumber,amount);

        print("Account Deposit of " + amount + " ws Successful \n");printATMMenu();
    }

    private static void withdrawMoney(){

        String accountNumber = input("Enter Your Account Number For Withdrawal");

        int amount = Integer.parseInt(input("Enter The Amount To Be Withdrawn"));

        String myPin = input("Enter Your  Account Pin to complete Withdrawal");
        access.withdraw(accountNumber, amount, myPin);
        print("Account Withdrawal of " + amount + " was Successful \n");printATMMenu();
    }

    private static void checkAccountBalance(){
        String accountNumber = input("Enter Your Account Number To View Balance");

        String pin = input("Enter this Account Pin");

        double balance = access.checkBalance(accountNumber, pin);
        print("Your Account Balance is " + balance + " \n");printATMMenu();
    }

    private static void transferTOOtherAccount(){
        String senderAccountNumber = input("Enter Your Account Number For Transfer");

        String receiverAccountNumber = input("Enter Recipient/Receiver's Account Number For Transfer");

        int amount = Integer.parseInt(input("Enter Amount To Be Transfer"));

        String myPin = input("Enter Your  Account Pin to complete Transfer");

        access.transfer(senderAccountNumber, receiverAccountNumber, amount, myPin);

        print("Your Transfer of " + amount + " To " + receiverAccountNumber + " was Successful \n");printATMMenu();
    }

    private static void changePin() {

        String accountNumber = input("Enter Your Account number for this Account");

        String oldAccountPin = input("Enter Pin that needs to changed for this Account");

        String newAccountPin = input("Enter The New Pin for this Account");

        access.changePin(accountNumber, oldAccountPin, newAccountPin);

        print("Your Change of Pin For This Account " + accountNumber + " was Successful \n");printATMMenu();
    }

    private static void exitProgram() {
        System.exit(0);
    }

}

