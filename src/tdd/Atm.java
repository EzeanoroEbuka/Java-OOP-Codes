package tdd;

public class Atm {
    int balance;
    public int checkBalance(String pin) {
        return  balance;
    }
    public void deposit(int amount) {
       if(amount > 0){ balance = balance + amount;};

    }
    public void withDraw(int amount) {
        if(balance >= amount && amount > 0) {balance = balance - amount;}
    }
    public void transfer(int amount,String pin2){

        withDraw(amount);
        deposit(amount);
    }
}
