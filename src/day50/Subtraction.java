package day50;

public class Subtraction extends Question {

    public Subtraction ( int num1, int num2) {
        super("-", "Subtraction question");
//        this.num1 = num1 ;
//        this.num2 = num2 ;
        // but we have to make sur enum1 is always more than num2 :

        if (num1 <num2) {
            int temp = num1;
            num1 = num2 ;
            num2 = temp ;
        }

        // after making sure that num1 is > num2
        //and just after that we set the value
        //CONst is used to set a correct logic!!

        this.num1 = num1 ;
        this.num2 = num2 ;

        }

    @Override
    public void calculate() {
        answer = num1 - num2 ;
        calculated = true ;
        //calculated is the instance field to keep track of the Question
    }

    @Override
    public String toString () {
        // how do I call toString method of super class so i can generate
        // something like this :
        // // The question type is Addition :  10+90 =
        if (calculated == true) {
            return super.toString() + num1 + operator + num2 + " = " + answer;
        } else {
            return super.toString() + num1 + operator + num2 + " = ";
        }



    }
}

