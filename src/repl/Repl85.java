package repl;

public class Repl85 {
    public static void main(String[] args) {
        for (int i = 1; i <=20 ; i ++ ){
            if (i % 3 == 0) {
                System.out.print (i+ " ");
            }
        }

        System.out.println();

        int i = 1;
        while (i<=20) {
            if (i % 3 == 0) {
                System.out.print(i+ " ");
            }
            i++;
        }
        //bunu nasil continue bilen yaparim ?

    }
}
