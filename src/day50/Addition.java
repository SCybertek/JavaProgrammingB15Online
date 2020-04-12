package day50;

public class Addition extends Question {

    // constructor to set num1 and num2 also questionType = addition
    // operator= + from super
    public Addition (int num1 , int num2 ) {
        super ("+","addition");
        this.num1 = num1 ;
        this.num2 = num2 ;
    }
    //inherited from super :
    // int num1 ;
    //    int num2 ;
    //    String operator;
    //    int answer ;
    //    boolean calculated;
    //    String questionType = "Unknown";

    //overridde:
    //public abstract void calculate () ;
    //it should implement calculate method
    //		toString method in below format
    //			return num1 + operator +  num2  =  "" if not calculated yet
    //			return num1 + operator +  num2  =  answer if already calculated

    @Override
    public void calculate () {
        answer = num1 + num2;
        this.calculated = true ; // if you come to this point it means you called
        //the calculated method to calculate the result
        //!!! IMPORTANT POINT
    }

    @Override
    public String toString () {
        if (calculated == true) {
        return num1 + operator + num2 + " = " + answer; }
        else {
            return num1 + operator + num2 + " = " ;
        }

        // how do I call toString method of super class so i can generate
        // something like this :
        // // The question type is Addition :  10+90 =
//        if (calculated == true) {
//            return num1 + operator + num2 + " = " + answer;
//            return super.toString() + num1 + operator + num2 + " = " + answer;
//        } else {
//            return num1 + operator + num2 + " = ";
//            return super.toString() + num1 + operator + num2 + " = ";
//        }
        //return calculated?num1+operator+num2+" = "+answer : num1+operator+num2+" = "; TERNARY OPERATOR!
    }
}
