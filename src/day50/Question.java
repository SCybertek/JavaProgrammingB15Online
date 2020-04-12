package day50;

public abstract class Question {

    int num1 ;
    int num2 ;
    String operator;
    int answer ;
    boolean calculated;
    String questionType = "Unknown";
    // for the sake of simplicity these are all public.so we omitted all getters and setters

    public abstract void calculate () ;

    public Question (String operator, String questionType) {
        this.operator = operator ;
        this.questionType = questionType ;

    }

    @Override
    public String toString () {
        return  "This question type is " + questionType + " :";

    }
}
