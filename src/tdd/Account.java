package tdd;

public class Account {
    private double balance;
    private String accountName;
    private String accountNumber;
    private String pin;

    public Account(String accountName, String  AccountNumber, String pin){
        this.accountName = accountName;
        this.pin = pin;
        this.accountNumber = AccountNumber;
    }

    public boolean validatePin(String pin) {
        if(this.pin.equals (pin)) {
            return true;
        }
       else throw new IllegalArgumentException("Wrong Pin");
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public double checkBalance() {
        return balance;
    }
    public void deposit(int amount) {
       if(amount > 0){ balance = balance + amount;}

    }
    public void withDraw(int amount) {
        if(balance >= amount && amount > 0) {balance = balance - amount;}
    }


    public void setNewPin(String newPin) {
        this.pin = newPin;
    }
}
