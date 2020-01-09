package day36;

public class SelfStudy {
    public static void main(String[] args) {


        Double a = Double.valueOf("24.8");
        //a.byteValue();
       a.doubleValue(); //This converts DOuble to double ? no?????

        System.out.println(a);

        a = a + a;
        a.doubleValue();

        System.out.println(a);
        
        char abc ='9';
        
        
        int myNum = Integer.parseInt(abc+ "");
        // we add " to convert char to STring in order to use Integer.parseInt method
        System.out.println("myNum = " + myNum);

       // Integer.parseInt(78); // will not work ! should be a STring
        
        //character to string  
        
        String.valueOf(abc);
        // this will turn abc to String 
        // you can use it with anything!!
        
        //also : 
        
         Integer num = Integer.valueOf("456"); // this value of will turn String to Integer
        System.out.println("num = " + num);
       // '9' == 9 --> false this is like saying 59 == 9 . because char asci number is 59
        
        int myNum2 = Integer.valueOf('9');
        System.out.println("myNum2 = " + myNum2); // it gives asci number 57


        int myNum3 = Integer.valueOf('9'+ ""); // gives result 9 
        System.out.println("myNum3 = " + myNum3); // we have to turn char into String to work!!!

        char myNum4 = Character.valueOf('9');
        System.out.println("myNum4 = " + myNum4); // this works .. hmm

        String str1 = "old";
        String str2 = str1;
        str1 = "new";

        System.out.println(str1);
        System.out.println(str2);

    }
}
