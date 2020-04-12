package day47;

public class FinalVariablesPractice {

    public static void main(String[] args) {


        //declaring and initializing a variable
        //declaring and assigning initial value

        int x= 10 ;

        //re-assgning new value to the variable
        // storing / giving new value to th evaraibal e
        //changing the original value of the variabl e

        x = 100 ;

        //declaring and initializing a variable
        //declaring and assigning initial value
        final int a = 20 ;
        //re-assiging new value to the final virable - ERROR!!!!
        //a = 20 ;
        //final keyword makes variable unchangeble

        String b = "Sofiya";
        final String c = "Miles";
        b = "Mervin";


    //final // if it was like that then address is locked on this 101 student
      //  you cannt assing to new Student( (102));

        final Student s1 = new Student(101);
        System.out.println("s1 = " + s1);;
//cannot reassign the value becaus eit it final !

        //s1.studentId = 200 ; this went red when student Id was final
        //it was already initialized with constructor and now we cannot change !


        System.out.println("s1 new value  = " + s1);
// here pointer is the same and object changes
        // like wife example

        //however the s1 cannot point to anew object !
       // s1 = new Student(23); this will not work


        Student s2 = new Student(101);

      //  s1 = s2 ;

        s2 = s1;

        System.out.println(s1.studentId);
        //s1 = day47.Student@816f27d this location
        System.out.println(s2.studentId);

        System.out.println(Student.SCHOOL); // static way of calluing
       //can not reassign value because its final !

        // Student.school = "abc";

        System.out.println(Byte.MAX_VALUE);

        System.out.println(Math.PI);

        printDoubledNumber(12);



    }

    /** this prints double the value of argument
     * @param x
     */
    //anywhere we declare a variable we can make it private
    //maing method parameter final
    //it will make the method only use the argument user has without modifying it
    public static void printDoubledNumber (final int x) {
        //x = x*2;
        System.out.println("x*2 =" + x*2);
    }
}
