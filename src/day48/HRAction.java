package day48;

import javax.lang.model.SourceVersion;
import java.util.Arrays;
import java.util.List;

public class HRAction {

    public static void main(String[] args) {

        //Employee is an abstract super type
        // hourlyEmployee
        //FullTimeEmployee are specific type ( concrete )

        //HourlyEmployee e1 = new HourlyEmployee("Subi", 101, 55, 2000) ;

        //if we have Employee data type for e1 variable
        //we can wirte fown the address of anything is-a employee
        //in this case it is either hourlyEmployee and FullTimeEmployee

        Employee e1 = new HourlyEmployee("Subi", 101, 55, 2000) ;
       // e1.calculateAnnualSalary();
                 e1 = new FullTimeEmployee( "Begli", 34, 10000) ;
            //     e1.calculateAnnualSalary();

                 //employee is general and full time and parttime is specific

        Employee e2 = new FullTimeEmployee( "Sof", 39, 10890) ;
        Employee e3 = new HourlyEmployee( "Mervin", 390, 123340, 46) ;


        /// to sum up peoples wages and pay : we can use ArrayList or Array .. which one would be easier ? Arraylist

        List<Employee> allEmployee = Arrays.asList(e1, e2, e3) ; // quick way to add memeber sto array list !!!!!
        // or you can do like : allEmployee.add (e1 );

        for ( Employee each : allEmployee ) {
            //System.out.println("each = " + each);
            System.out.println("Name is = " + each.name) ;
                    each.calculateAnnualSalary() ;
        }


    }
}
