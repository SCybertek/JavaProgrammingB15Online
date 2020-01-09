package day22;

public class ArrayCreation2 {
    public static void main(String[] args) {

        //creating an array in second way

        int [] ages = new int [] {3,5,11,33,57,18};
        // int [] ages;
       // ages = new int[] {1,2,3,4};

        int itemCount = ages.length;
        //System.out.println(itemCount);
        System.out.println("itemCount = " + itemCount);
        System.out.println("ages = " + ages);

        //printing them

        for (int x = 0; x < itemCount; x++) {
            System.out.println(ages[x]);
        }

//these has to be in one line !!
        int [] areaCode = {703, 300,954};


        for (int x = 0; x < areaCode.length; x++) {
            System.out.print(areaCode[x]+" ");
        }
    }
}
