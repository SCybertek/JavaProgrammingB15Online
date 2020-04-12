package day52.warmup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AccountListSorting {

    public static void main(String[] args) {

        //only thing that is sortable is the thing that you can compare

        List<Account>  accountList = new ArrayList<>();

        accountList.add( new Account("Sofiya",120000));
        accountList.add( new Account("Vlad", 11000));
        accountList.add( new Account("Begli",300000));
        accountList.add( new Account("Miles",150000));
        accountList.add( new Account("Mervin",170000));
        accountList.add( new Account("John Snow",12000));

        System.out.println("accountList before = \n" + accountList);
        Collections.sort(accountList);
        System.out.println("accountList after = \n" + accountList);


// //create another account with your name
        //        //transfer everyone's money to your account

        Account myAccount = new Account("Sof",0);
        for (Account each : accountList) {
            each.transferAll(myAccount);
        }

        System.out.println("myAccount = " + myAccount);

        //now i am rich :)

        //        Account seda = new Account("Seda Civan", 5000);
        //        for (int i = 0; i < accountList.size(); i++) {
        //            accountList.get(i).transferAll(seda);
        //        }
        //        System.out.println("seda = " + seda);
        //​
        //    }
        //    //output
        //    //seda = Account{name='Seda Civan', balance=173000}


        // What can be the data type of a1
        /*
         * Account a1 ;
         * Comparable a1 ;
         * Transferable a1 ;
         * Object a1
         *
         * An object can be referred by
         *       it's own type
         *       it's super class type
         *       interface type that it implemented
         *
         * */


        Account a1 = new Account("Polymorphism1", 10000);
        Transferable b1 = a1;
        Transferable t1 = new Account("Polymorphism2", 10000);
        Comparable c1 = new Account("Polymorphism4", 10000);
        Object o1 = new Account("Polymorphism3", 10000);


    }





}
