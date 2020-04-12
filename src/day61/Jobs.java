package day61;

public class Jobs implements Comparable<Jobs> {

    //this type of class represents Data
    // it has specific name POJO : plain old java object

    //Comparable Interface : in order to sort a type, it has to be Comparable
    //comparable interface is coming from JDK
    //to provide comparing logic , this will become the natural order for sorting

    private String location;
    private int salary;
    private String companyName;

    public Jobs(String location, int salary, String companyName) {
        this.companyName = companyName;
        this.salary = salary;

        this.location = location;
    }

    @Override
    public String toString() {
        return "Jobs{" +
                "location='" + location + '\'' +
                ", salary=" + salary +
                ", companyName='" + companyName + '\'' +
                '}';
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public int compareTo(Jobs o) {
        if (o.salary < this.salary) {
            return 1;
        } else if (o.salary > this.salary) {
            return -1;
        } else {
            return 0;
    }

        // return Comparator.comparing(Job::getSalary)
        //                .thenComparing(Job::getLocation)
        //                .compare(this, o); ??

}
    }

     //return this.salary == o.salary ? 0 : this.salary > o.salary ? 1 : -1;





