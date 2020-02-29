package day06;

public class CompoundOperator {
    public static void main(String[] args) {
        //allignment operator= calculate the result on right side and assign the result to the left side variable
       //last assigned value counts

        // += , -=, *=, /= , %=  are called compound operator , shorthand operator
        //it can simplify the operation if you have same variable


        int studentOnline = 263 ;
        studentOnline+= 5;
        System.out.println("5 people joined the class "+ studentOnline);



        // studentOnline = studentOnline + 5;
        //System.out.println(studentOnline);

        //studentOnline = studentOnline -3;
        //System.out.println(studentOnline);

        studentOnline-=3;
        System.out.println("3 people dropped the class"+studentOnline);

        //studentOnline = studentOnline*2;
        studentOnline*=2;
        System.out.println("number of students doubled "+ studentOnline);

      // studentOnline = studentOnline + studentOnline;
        // System.out.println("the student count doubled "+ studentOnline);

        //studentOnline= studentOnline/3;
        studentOnline/=3;
        System.out.println("student number dropped to 1/3 "+ studentOnline);



    }
}
