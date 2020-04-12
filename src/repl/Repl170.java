package repl;

import java.util.Arrays;

public class Repl170 {

    public static void main(String[] args) {
//10, 0, 20, 4, 0, 1, 6, 0}
        //int[] inhabitants = {3, 6, 0, 4, 3, 2, 7, 0};
        int[] inhabitants = {0 ,20, 0, 20, 20, 10, 0 ,10 };

        //AT the end of the day this solutin could not pass all the tests :(
        int day=0;
        int temp[]=new int[8];
        int zeros[]={0, 0, 0, 0, 0, 0, 0, 0};

        do{
            System.out.println("Day " + day+" "+ Arrays.toString(inhabitants));
            for (int i = 0; i <temp.length ; i++) {
                temp[i]=inhabitants[i];
            }
            for (int i = 0; i <8 ; i++) {
                if (i==0&&temp[0]==0){
                    inhabitants[1]=temp[1]/2;
                } else if(i==7&&temp[7]==0){
                    inhabitants[6]=temp[6]/2;
                } else if(temp[i]==0){
                    inhabitants[i-1]=temp[i-1]/2;
                    inhabitants[i+1]=temp[i+1]/2;
                }
            }day++;
        }while(!Arrays.equals(inhabitants,zeros));

        System.out.println("Day " + day+" "+ Arrays.toString(inhabitants));

        System.out.println("---- EXTINCT ----");

//        int day = 0;
//
//      //  for ( int each : inhabitants) {
//        do {
//            System.out.println("Day " +  day + " " + Arrays.toString(inhabitants));
//
//           // day++;
//
//
//
//            for (int city = 0; city < inhabitants.length; city++) { //city is representing cities
//                if (inhabitants[city] == 0) { // only enter in here if value of city is 0 :( if city is already 0 in population)
//                    if (city == 0) { // first city is empty then :
//                        inhabitants[city + 1] = inhabitants[city + 1] / 2;
//                        if (inhabitants[city + 2] == 0) { //this condition needed to make sure that next city is skipped in case the
//                            city+=2;}
//                    } else if (city == inhabitants.length - 1) { // last city is empty then
//                        inhabitants[city - 1] = inhabitants[city - 1] / 2;
//                    } else {
//                        inhabitants[city - 1] = inhabitants[city - 1] / 2 ;
//                        inhabitants[city + 1] = inhabitants[city + 1] / 2;
//                        if (inhabitants[city + 1] == 0) { //this condition needed to make sure that next city is skipped in case the
//                            city++;
//                        }else if ( (city + 2 < inhabitants.length) && (inhabitants[city + 2] == 0) ){ //this condition is to make sur ethat number that has been divided earlier
//                            city+=2;
//                        }
//
//
////                        if  ((inhabitants[city + 1] == 0) || (inhabitants[city -1] == 0) ) { //this condition needed to make sure that next city is skipped in case it is 0 after modification
////
////                            continue;
////
////                        }
//
//                    }
//                }
//
//            } day++;//sout after ?
//
//
//        } while ((inhabitants[0] + inhabitants[1] + inhabitants[2] + inhabitants[3] + inhabitants[4] + inhabitants[5] + inhabitants[6] + inhabitants[7] ) != 0);
//
//        System.out.println("Day " +  day + " " + Arrays.toString(inhabitants));
//        System.out.println("---- EXTINCT ----");
//
////
    }
}


