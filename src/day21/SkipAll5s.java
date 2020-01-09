package day21;

public class SkipAll5s {
    public static void main(String[] args) {

//
//        for (int i = 1; i <=100 ; i++) {
//            if (i%5==0){
//                System.out.println("Skipping "+ i);
//                continue;
//            }
//            System.out.println(i);
//        }

        for (int x = 1; x <=100 ; x++) {
            if (x%5!=0){
                System.out.println(x);
            }else {
                System.out.println("Skipping "+ x);
            }
        }

    }
}
