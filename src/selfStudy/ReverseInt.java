package selfStudy;

public class ReverseInt {

    public static void main(String[] args) {

        int x = 12345, reversedNum = 0;

        // to reverse a single number we can convert it to a String ?
        String stringRepX = String.valueOf(x);
        String reversed ="";
        for (int i = stringRepX.length() -1 ; i >= 0  ; i--) {

            reversed+= stringRepX.charAt(i);
        }
        System.out.println("reversed number as a string= " + reversed);

    // do not convert into String!!

        while(x != 0) {
            int digit = x % 10; // 5 -- 4
            reversedNum = reversedNum * 10 + digit; // 5 first iteration /  5*10 + 4
            x /= 10; //  1234 //123
        }
        System.out.println("Reversed Number: " + reversed);



    }
}
