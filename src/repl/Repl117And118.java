package repl;

public class Repl117And118 {
    public static void main(String[] args) {

        String [] arr = { "apple", "banana","kiwi", "grape","milk", "soda","juice", "coffee"  } ;

        // output should be : apple , banana
        //          kiwi , grape
        //          milk, "soda"
        //          juice, coffee

        //LOGIC :
        // loop array by skipping one?

        for (int i = 0; i < arr.length; i= i+2) {
            System.out.println(arr[i] + " , " + arr[i+1]);
        }

        String [] arr2 = {"apple", "banana","kiwi", "grape","milk", "soda"};

        for (int i = 0; i < arr2.length-2; i++) {
            System.out.println(arr2[i] + " , " + arr2[i+1] + " , " + arr2 [i+2]);

        }

    }
}
