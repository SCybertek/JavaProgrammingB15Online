package repl;

public class Repl163 {
    public static void main(String[] args) {

        //Create a method that gets an array of strings and a string, the method returns an int.
        //
        //It counts how many times a string appears in the array and returns the count.
        //
        //for example (pseudo code):
        //some_array = ["a","foo","bar","foo","bla"]
        //
        //some_string = "foo"

        //output is 2 !



    }

    public int count_appearance(String[] arr,String t) {
        int count = 0 ;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals(t)) {
                count++;
            }
        }



        return count;
    } //end  count_appearance
}
