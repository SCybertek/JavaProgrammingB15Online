package selfStudy.passByValue;

public class Student {

    public int age ;

    public Student (int age ) {
        this.age = age ;
    }


    static void changeStudent( Student s ) {
        //assigning new value inside will lose the reference to original object
        //copied reference now pointed to the new object

        s = new Student(29);
        System.out.println("s age value inside " + s.age);
    }

    static void chandeStudentAge (Student s) {
        //using copied reference to change field will change original object

        s.age = 29 ;
        System.out.println("s age value inside " + s.age);
    }

    static void switchStudent (Student s1, Student s2) {
        Student temp = s1;
        //store s1 value to a temp variable
        s1 = s2 ;
        //set s2 value to s1 variable
        s2= temp;
        System.out.println("st1 age value inside: " + s1.age + " | st2 age value inside: " + s2.age);

    }
}
