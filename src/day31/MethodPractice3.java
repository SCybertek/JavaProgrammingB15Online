package day31;

public class MethodPractice3 {
    public static void main(String[] args) {
         /*
        create a class called MethodPractice3
         //write piece of reusable code to count from 1 to 10
        //give a name count1to10                                : method name
        // no need for object when being called                 : static
        // it should be accessible anywhere in your project     : public
        //it does not return any value                          : void
        //does not need any extrrnal date                       : (nothing is here)

        create amethod called countDownFrom20tillOne
        create a method to print odd numbers 1-100
        create a method to spell your name: Seda --> S-e-d-a
         */
         coundDownFrom20tillOne();
         printOddNumbers1to100();
         spellYourName();



    }
    public static void coundDownFrom20tillOne (){
        for (int i = 20; i >=1 ; i--) {
            System.out.print(i + " ");

        }
        System.out.println();

        //   create a method to print odd numbers 1-100

    }

    public static void printOddNumbers1to100(){
        for (int i = 1; i <=100 ; i++) {
            if(i%2==1){
                System.out.print(i+" ");
            }


        }
        System.out.println();

      //  create a method to spell your name: Seda --> S-e-d-a

    }
    public static void spellYourName() {
        String myName = "Sofiya";
        for (int i = 0; i < myName.length(); i++) {
            if (i == myName.length() - 1) {
                System.out.println(myName.charAt(i)); } else {
                System.out.print(myName.charAt(i) + "-");
//
            }
        }
        }
    }

