package day46;

public class SavingAccount extends BankAccount{
    
    double interestRate ;
    //String accountHolder ;
    //    long accountNum ;
    //    double balance ;
    //    


    /**
     * 
     * @param accountHolder
     * @param accountNum
     * @param balance
     * @param interestRate
     */
    public SavingAccount (String accountHolder , long accountNum, double balance, double interestRate) {
        super(accountHolder,accountNum,balance); // reason :dry principle
        this.interestRate = interestRate ;
    }
//bad idea to have main here, just doing it anyway 
    
    public static void main(String[] args) {
        SavingAccount s1 = new SavingAccount("Muhammed", 12345, 500 , 0.042) ;
        System.out.println("s1.toString() = " + s1.toString()); // or s1 ) will print anyway. we added toString in here to show explicitly that it is calling it behind the scenes

        s1.withdraw(100);
        System.out.println("s1 = " + s1);

        s1.deposit(1000);
        System.out.println("s1 = " + s1);
    }
//every class had toString.. we need to override it

//TAsk :
    //override deposit method
    // every deposit you make you will get interest added according to your interest rate
    // if you deposit 100 your interest rate is 4.2 then
    // your balance will increase = 100 + ( 100 * 0.042 )


    @Override // this is called annotation
    //it will ensure this is actually a valid overriden method
    //if any rule does not match , it will not even compile
    public void deposit(int amount) {

        //balance = balance + amount + (amount * interest)
        //calculating the interest rate and casting to int variable
        // because deposit method accept int data type not double !!
       int actualAmount = (int) (amount + amount*interestRate) ;
       super.deposit(actualAmount);
       //  super.deposit(amount + (amount * ((int)interestRate/100)));

    }


    // TASK:
    // in our savingAccount , if we withdraw amount you withdraw
    // you get 30 dollar penalty
    // we will override the withdraw method to reflect this requirement

@Override
    public void withdraw (int amount) {
        //balance -= (amount + 30);

       //or
    // balance = balance - amount - 30 ;
        //or
//
//         balance -= amount ;
//         balance -= 30 ; // this is a penalty

    super.withdraw(amount+30); // this is the way to call superClass method in another instance method

    // also
//    super.withdraw(amount);
//    super.withdraw(30);
    }



    @Override // it makes it obvious that you have method Override
    // it is optional, once being used, it will enforce overriding rule
    // if any rule does not match it will not even compile
    // so it's always good to use it to prevent accidental errors
    public String toString() {
        return "SavingAccount{" +
                "interestRate=" + interestRate +
                ", accountHolder='" + accountHolder + '\'' +
                ", accountNum=" + accountNum +
                ", balance=" + balance +
                '}';

        // if it was String tostring () it would print HAshcode again!
    }
}

