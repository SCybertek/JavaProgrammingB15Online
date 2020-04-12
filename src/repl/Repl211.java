package repl;

import java.util.ArrayList;

public class Repl211 {


    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3); //1
        arr.add(3); //1
        arr.add(1); // 1
        arr.add(2); //0
        arr.add(6); //2
        int times = refuel_times(arr, 3);
        System.out.print(times);//should output 5


    }

    public static int refuel_times(ArrayList<Integer> deliveries, int max_fuel) {

        int sum = 0;

        for (Integer each : deliveries) {
                 sum += each ;
            }
        int stops = sum / max_fuel ;
        if (sum % max_fuel != 0) {
            stops++ ;


        }
        return stops;
    }

    //Tugba s code :
    //   double sum=0;
    //    for(Integer number: deliveries){
    //        sum+=number;
    //    }
    //    return (int)Math.ceil(sum/max_fuel);
    //}
}
