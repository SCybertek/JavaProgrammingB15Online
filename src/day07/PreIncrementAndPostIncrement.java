package day07;

public class PreIncrementAndPostIncrement {
    public static void main(String[] args) {
        //Increment and decrement has two versions
        //pre-increment ++score and post increment score++
        //pre-decrement --score and post decrement score--
 int apple = 8;
 apple++;

 System.out.println(apple); //here it is 9
 //System.out.println(++apple); //increasing the value by 1 and print
 System.out.println(apple++);
 //it is not about adding it is about WHEN it does it
        //  it will increase the value
        //BUT it will reflect the increased value next time teh variable show up!!
 System.out.println(apple);
 int score = 50;
 System.out.println(++score); //51
 System.out.println(score++); // 51 ready to be 52 next time
 System.out.println(score); //52
 System.out.println(--score); //51
 System.out.println(score--); //51 ready to be 50 next time
 System.out.println(score); // 50



    }
}
