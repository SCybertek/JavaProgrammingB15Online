package day48;

public class EmploymentChart {
    // there is no specific name for this class
    // we can call it RUnner class. Class that has main method
    public static void main(String[] args) {

        HourlyEmployee h1 = new HourlyEmployee ("Subi", 101, 55 , 2000);
        //System.out.println("h1 = " + h1);
        h1.calculateAnnualSalary();

        System.out.println("h1 = " + h1);
        
        
        FullTimeEmployee b1 = new FullTimeEmployee( "Begli", 34, 10000) ;
        b1.calculateAnnualSalary();

        System.out.println("b1 = " + b1);
    }
}
