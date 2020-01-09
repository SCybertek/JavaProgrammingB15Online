package day23;

public class WarmUp_Array {
    public static void main(String[] args) {
        /*
        //  create an int array of 7 items
//  assign values
// 1,  print out in reverse order
// 2 , store last item in a variable called lastItem
            // print it out separately
// 3 , print the item right in the middle
//
// OPTIONALLY : find sum , find average , find max , find min



         */
        //first WAY TO CREATE AN ARRAY:
//        int [] num = new int [7];
//         num [0]= 23;
//         num [1]=12;
//

       // int [] ages = new int [] {3,5,11,33,57,18};

        //this MUST happen in one line:we cannot declare first and assign later
        int [] num = {12,34,65,43,78,89,76};
        //item count is 7
        //last index is 6

        System.out.println(num[0]);
        System.out.println(num[1]);


        for (int i = num.length-1; i >=0 ; i--) {
            System.out.println("num" + num[i]);
            //we access array using INDEX!!!

        }


        int arraySize = num.length;
        int lastItemIndex= arraySize-1;
        int lastItemValue= num[lastItemIndex];
        System.out.println("lastItemValue = " + lastItemValue);

        int middleItemValue = arraySize/2;
        //num[num.length/2] --- will give me middle number value 
        System.out.println("num[middleItemValue] = " + num[middleItemValue]);

        int sum = 0;
        for (int x = 0; x <arraySize ; x++) {

            int currentItem= num[x];
            sum = sum +currentItem; // sum = sum + item[index];


        }

        System.out.println("sum = " + sum);















    }
}
