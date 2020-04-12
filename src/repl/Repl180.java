package repl;

public class Repl180 {
    public static void main(String[] args) {


        System.out.println(coverString("java methods", "me"));
    }


    public static String coverString(String main, String coverME) {

//Your job is to write an important code that will :
//
//- to search and find each appearance of coverME within main
//- then surround it with [coverMe] (square brackets)
//- if you cannot find the coverME within main after tirelessly looping then just return whole main itself covered [main].
//- keep in mind that coverME value can be of any length.

        //logic : to test if main contains coverMe

//        if (main.contains(coverME)) {
//            return  main + "[" + coverME + "]"; // java methods[me]
//            // need to get the location of coverMe
//        }else {
//            return "[" + main + "]";
//        }

// this below did not support every Test case

//            if (main.contains(coverME)) {
//                int indexBeginning = main.indexOf(coverME);
//                int restart = indexBeginning + coverME.length() ;
//
//                return main.substring(0, indexBeginning) + "[" + coverME + "]" + main.substring(restart);
//            } else {
//                return "[" + main + "]";
//            }

            //genious solution :
        if (main.contains(coverME)) {
            String covered = "[" + coverME + "]";
            return main.replace(coverME, covered);
        }else {
            return "[" + main + "]";
        }

        }

}



