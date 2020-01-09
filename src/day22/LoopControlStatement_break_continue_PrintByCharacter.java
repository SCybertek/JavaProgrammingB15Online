package day22;

public class LoopControlStatement_break_continue_PrintByCharacter {
    public static void main(String[] args) {

        /*
        create String :
        I struggle with Java I like Java I love Java Everything is Awesome!
        print every other letter meaning:
        1. skip a letter each time you go through th eletter
        even Indexes
        use continue for this task
        2. when you reach letter A break loop
         */
        //                 0123456789...
        String sentence = "I struggle with Java I like Java I love Java Everything is Awesome!";

        int charCount = sentence.length();
        //  int indexCount = charCount -1 ;


        for (int i = 0; i < charCount; i++) {
            String currentChar = sentence.substring(i, i + 1); // this is ONE SINGLE CHARACTER


            if (i % 2 == 1) {
                continue;
            }
            System.out.println(i + " : " + currentChar);


        }
        
        //TASK 2

        for (int i = 0; i < charCount; i++) {
            String currentChar = sentence.substring(i, i + 1);

            if (currentChar.equalsIgnoreCase("a")) { // you can add || and ask 'n' lowercase n
               // System.out.println("Found it!!");
                break;
            }
            System.out.println("currentChar = " + currentChar);
        }

        // Task 1 and 2 combined

        for (int idx = 0; idx < charCount; idx++) {
            // this is the code to skip odd number index letters
            if (idx % 2 == 1) {
                // this line will skip the rest and move to next iteration
                continue;
            }
            // this is storing each character as String
            String currentChar = sentence.substring(idx, idx + 1);
            // this is checking the currentChar is J or j
            if (currentChar.equalsIgnoreCase("J")) {
                break;// this will stop the loop
            }
            // printing out index and the character at that index
            System.out.println(idx + " index "
                    + " : currentChar = " + currentChar);

        }



       // to break on 3rd j : create counter and count until 3 then break

        /* code from : Muhammet Fatih Arslan

        public static void main(String[] args) {
        String text= "I struggle with Java I Like Java I love Java Everything is Awesome!";
        String b=text.toLowerCase();
        String c="";
        int y=0;
        for (int i = 0; i <text.length() ; i++) {
            c=b.charAt(i)+"";
            if (c.equals("a")) {
               y++;
                if (y==3) {
                    break;
                }
            }else if (i%2==1) {
                continue;
            }
            System.out.print(text.charAt(i));
        }
    }
}

         */
    }
}
