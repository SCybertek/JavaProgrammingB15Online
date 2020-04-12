package day48;

public class FullTimeEmployee extends Employee {
// this concrete class is used to implement super class // create a body for the methods in superClass
    double monthlySalary ;

    public FullTimeEmployee (String name, int id, double monthlySalary) {
        super(name, id);// if we do not call super we can do this
        // this.name = name
       // this.id = id ;
        //BUT FOR ABOVE TO WORK WE HAVE TO HAVE EMPTY ?DEFAULT CONSTRUCTOR IN SUPER!!!
        this.monthlySalary = monthlySalary;
    }

    public void calculateAnnualSalary () {
        double total = monthlySalary * 12 ;
        System.out.println("total salary of full time employee= " + total);

    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                "monthlySalary=" + monthlySalary +
                ", name='" + name + '\'' +
                ", id=" + id + " annual salary " + monthlySalary*12 +
                '}';
    }


}
