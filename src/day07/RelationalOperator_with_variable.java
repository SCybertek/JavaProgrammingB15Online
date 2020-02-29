package day07;

public class RelationalOperator_with_variable {
    public static void main(String[] args) {

        // > >= < <= == != relational operator

        //RelationOperator is used to compare 2 numbers
        //and return true or false
        //can be called boolean expression

        int myNumber =10;


        System.out.println(myNumber>5);
        System.out.println(myNumber< -5);
        System.out.println(myNumber>=5);
        System.out.println(myNumber>=8);
        System.out.println(myNumber<=5);
        System.out.println(myNumber>=8);


        //== is used to check for equality
        //and VERY different from single =

        //difference between == and = same as difference between equal and equality in plain english

        System.out.println(myNumber==5);

        // != is used to check for inequality, ! in programming is NOT equal to

        System.out.println(myNumber != 10);
        System.out.println(myNumber != 6);

        // == and != are questions, checking for equality or inequality

    }
}
