package repl.repl224;

public class Person {

    private String firstName ;
    private String lastName ;
    private int age ;

    //these are no arg and 3 args const.
    public Person () {
        this.firstName = "undefined";
        this.lastName = "undefined";
        this.age = -1 ;
    }

    public Person ( String firstName , String lastName , int age) {
        this.firstName = firstName ;
        this.lastName = lastName ;
        this.age = age ;
    }

    //getters and setters for encapsulated private instance field
    public String getFirstName () {
        return firstName ;
    }

    public void setFirstName ( String firstName) {
        this.firstName = firstName ;
    }

    public String getLastName () {
        return lastName ;
    }

    public void setLastName ( String lastName) {
        this.lastName = lastName ;
    }

    public int getAge () {
        return age ;
    }

    public void setAge ( int age) {
        this.age = age ;
    }

    public String toString(){
        return firstName + "|" + lastName + "|" + age ;
    }



}
