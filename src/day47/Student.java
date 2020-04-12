package day47;

public class Student {
    //final instance field :
    final int studentId ;
    //public final static field with initial value set :
    //this type of field name alsways suggested to make all uppercase
    //to mait it clear that this is a public static field that never change
    // other language has specific term called CONSTANT for this
    //public static final field = in Java

    //if interviewer asks how do I define CONSTANT in java ?
    // you say I will create public static final field :)

    //IntelliJ automatically recognize constant (public sttaic field)
    // it will automativcally make it italic
    // easy way to distinguish fields and methods is
    //by looking at () at th ened

    public  static final String SCHOOL = "Cybertek";

    public  Student (int studentId) {
        this.studentId = studentId ;

    }

//    @Override
//    public String toString() {
//        return "Student{" +
//                "studentId=" + studentId +
//                '}';
//    }

    //sat jan 25 at 1:25 pm listen hwo from hash code to regular
}
