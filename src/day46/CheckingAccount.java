package day46;

public class CheckingAccount extends BankAccount {

    // no additional field

    // String accountHolder ;
    // long accountNum ;
    // double balance ;


    public CheckingAccount(String accountHolder, long accountNum, double balance) {
        super(accountHolder, accountNum, balance);
    }

    // this awesome bank acc will give you 200 if you deposit over 3000

    @Override
    public void deposit(int amount) {

        if (amount >= 3000) {
            super.deposit(amount+200);
        } else {
            super.deposit(amount);
        }
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNum=" + accountNum +
                ", balance=" + balance +
                '}';
    }


}
