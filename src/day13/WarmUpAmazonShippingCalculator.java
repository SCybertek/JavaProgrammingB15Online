package day13;

public class WarmUpAmazonShippingCalculator {

    public static void main(String[] args) {
        /*
        amazon prime member and regular member
        prime: free shipping
        regular: free only if order os pver 25
        otherwise pay 5 $ for shipping

         */

        String memberType = "Primes Member";
        double amount = 5.99d;
        int shippingFee= 0;
        //first I need to check if person is prime member or not
        if (memberType.equalsIgnoreCase("prime member")){
            System.out.println(" You get 1 day Free shipping ");
            System.out.println("your final price is"+ amount);
        }else if ( amount>25) {
            //!memberType.equalsIgnoreCase("PRIME MEMBER")); this is also another way of doing it

            System.out.println("Not a prime member but your order is more than 25");
            System.out.println("you get a free shipping on amount "+ amount);
        } else {
            System.out.println("Do you wanna sign up for prime membership?");
            shippingFee= 5;
           // amount = amount+shippingFee;
            amount += shippingFee;
            System.out.println("Your final about is "+ amount);
        }






    }


}
