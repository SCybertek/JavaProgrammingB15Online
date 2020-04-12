package day48;

public class HourlyEmployee extends Employee{

    // our class is concrete (HourlyEmployee ) thats why we need to implement ALL ABSTRACT SUPER CLASS METHODS!

    double hourlyWage;
    int numberOfHours ; // annual hours

    public HourlyEmployee (String name, int id, double hourlyWage, int numberOfHours) {
        super (name, id) ; // you are calling the super constructor!!!
        this.hourlyWage = hourlyWage;
        this.numberOfHours = numberOfHours ;
    }

    @Override
    public void calculateAnnualSalary() {
        double annual = hourlyWage * numberOfHours;
        System.out.println("annual salary of hourly employee = " + annual);

    }

    public String toString () {
        return "Hourly Employee = { name " + name + " id= " + id +
                " hourly wage= " + hourlyWage + " number of hours= " + numberOfHours +
                " yearly salary= " + (hourlyWage * numberOfHours);
    }
}
