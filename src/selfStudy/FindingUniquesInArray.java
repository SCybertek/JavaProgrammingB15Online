package selfStudy;


public class FindingUniquesInArray {

    public static void main(String[] args) {

//finding unique in String array :
        String [] arr = {"sof","beg","sof","merv","merv"};

        for (int i = 0; i < arr.length ; i++) {
            int count = 0;
            for (int j = 0; j < arr.length ; j++) {
                if ( arr[i].equalsIgnoreCase(arr[j])) {
                    count++;
                }
            } if (count ==1) {
                System.out.println(arr[i]);
            }
        }


        //finding unique in int array:

        int [] nums = { 23,4,5,4,23,7,5};

        for (int i = 0; i < nums.length; i++) {
            int count = 0 ; // we need it to be 0 everytime the second number starts to loop from the beginning
            for (int j = 0; j < nums.length ; j++) {
                if (nums[i]==nums[j]){
                    count++;
                }
            } if (count == 1){
                System.out.println(nums[i]);
            }
        }
    }
}
