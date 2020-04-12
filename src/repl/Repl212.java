package repl;

public class Repl212 {


    //here we have 2  Twodimentional Array [] [] :
    //[
    //["euro","1.5"],
    //["yen","21.5"],
    //["mark","100.0"]
    //
    //]

    //and conversion :
    //[
    //["euro","0.003"],
    //["yen","0.5"],
    //["mark","0.87"]
    //]

    public static  double convertC(String[][] money,String[][] convertionRate) {

        double sumUSD = 0 ;
        // Double.parseDouble(money[0][1]); // 5

        for (int i = 0; i < money.length; i++) { // overall length of money array ( how many rows)
          //  for (int j = 0; j < convertionRate.length ; j++) { // how many columns .. we are interested in second column. index 1.
                sumUSD += Double.parseDouble (money[i][1]) * Double.parseDouble(convertionRate[i][1] );

            }






        return sumUSD;
    }

    public static void main(String[] args)
    {



        String[][] test_money =
                {
                        {"mark","5"},
                        {"shekel","30.5"},
                };

        String[][] test_convert=
                {
                        {"mark","1"},
                        {"shekel","0.5"},
                };

        double res = convertC(test_money,test_convert);
        System.out.print(res);

    }

}
