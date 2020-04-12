package day46;

public class BankAccount {

    String accountHolder ;
    long accountNum ;
    double balance ;

    // always add no arg constructor to avoid error in subclass
    //because of super() call

    public BankAccount () {

    }
    public BankAccount(String accountHolder, long accountNum, double balance) {
        //super();
        this.accountHolder = accountHolder;
        this.accountNum = accountNum;
        this.balance = balance;
    }

    public void deposit (int amount) {
        balance += amount ; // balance = this.balance + amount;
    }
    public void withdraw (int amount) {
        balance -= amount ;
    }
}
