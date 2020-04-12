package officeHour;

public class Teacher {

    private String name ;
    private int age;

    /// bad idea having main method in your template
    // lets do it anyway

    public static void main(String[] args) {

        Teacher t1 = new Teacher() ;
//        t1.setName("Svetlana");
//        t1.setAge(19);

        t1.initializeFields("Nuran", 18);

        System.out.println("t1.getAge() = " + t1.getAge());
        System.out.println("t1.getName() = " + t1.getName());


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // method to set both age and name
    public void  initializeFields ( String name , int age) {
//        this.name = name ;
//        this.age = age ;

        // what is setting the name require 100 lines of  check
        // what if setting the age require 100 lines of check ??
        // can I just reuse th emethod I already have for setting name and age??
        setName(name);
        setAge(age);

        // at this age we did not know anything about constructor
    }
}
