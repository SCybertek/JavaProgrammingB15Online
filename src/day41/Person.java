package day41;

public class Person {

    // private make it only accessible within the same class
    private String name;
    private int age;
    private long ssn;


    // now our data is encapsulated !!! so nobody can come in and reset it ..
    // unless the call the method




    // what if I want to only get the name
    public String getName() {
        return name;
    }

    // what if I want to only change the name
    public void setName(String newName) {
        name = newName;
    }


    // write a method to give value to the filed
    public void setAll(String newName, int newAge, long newSsn) {
        // YOU CAN PUT WHATEVER CHECK HERE TO MAKE SURE
        // THE DATA IS CORRECT or any other logic
        name = newName;
        age = newAge;
        ssn = newSsn;
    }

    // lets create the method called get age
    public int getAge() {
        return age;
    }
    // now we need to set it
    public void setAge (int newAge) {
        age = newAge;
    }


    // create th emethod called get ssn

    public long getSsn () {
        return ssn ;
    }

    // no we need to set SSN that should be void ( could be return too but setting is better void)

    public void setSsn (long newSsn) {
        ssn = newSsn ;
    }




    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", ssn=" + ssn +
                '}';

    }

}
