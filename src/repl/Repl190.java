package repl;

import java.util.Arrays;

public class Repl190 {

    //merge 2 arrays into 1
    // HINT :
    //create a length int for the combined length of both arrays.
    //create an array with that length (thats the array we will return).
    //create an iterator for both arrays (int z=0).
    //
    //loop first array and inside the loop insert current element to the return array (ret[z]=a[i];)
    //then increment the iterator for both arrays (z++).
    //
    //do the same for the second array.

    public static int[] mergR(int[] a, int[] b) {

        int length = a.length + b.length; // combined length
        int[] result = new int[length];// array creation ???

        for (int i = 0; i < a.length; i++) {
                result[i] = a[i];
            }


        for (int i = 0; i < b.length; i++){
                result[a.length + i] = b[i];

        }


        return result;

    }

    //Karimas code:
    //public static int [] mergR(int[] a,int[] b) {
    //        int lengthNewArr = a.length + b.length; // length of new Array
    //        int [] newArr= new int[lengthNewArr]; // create new array
    //        int z=0;
    //
    //        for(int eachElement : a){
    //            newArr[z] = eachElement;
    //            z++;
    //        }
    //        for(int eachElement : b){
    //            newArr[z]=eachElement;
    //            z++;
    //        }
    //        return newArr;

    //this code is very neat : Sumeyra Altuntas:

    // int[] arr=new int[a.length+b.length];
    //     for (int i = 0,j=0,k=0; i <arr.length; i++,j++) {
    //       if(i<a.length){
    //          arr[i]=a[j];
    //       }else {
    //         arr[i] = b[k];
    //           k++;
    //             }
    //     }
    //      return arr;
}
