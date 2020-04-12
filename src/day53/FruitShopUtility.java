package day53;

public class FruitShopUtility {

    public static void main(String[] args) {


        Fruit f1 = new Apple("crispy but tasteless", "hot red", "Gala");
        Fruit f2 = new Orange("sour", "orange", 12);

        displayFruit(f1);
        System.out.println("=======");
        displayFruit(f2);
        System.out.println("=======");
        digestBetter(f1);
        System.out.println("=======");
        System.out.println(getMyFavoriteFruit());
        // what can i do with this method? getMyFavoriteFruit()

        Fruit x = getMyFavoriteFruit();
        //what can I do with x?
        x.getDigested();
        System.out.println("Batch 15 Fav. fruit = " + x);

        System.out.println(getFavoriteByType(5));

        System.out.println(getFavoriteByType(2));

        System.out.println(getFavoriteByType(1));

        System.out.println("==================");

        eatFruits(f2);

        //can we directly pass an object IS -A fruit rather than saving it into variable ?
        //YES
        digestBetter(new Apple("crispy but tasteless", "hot red", "Golden") );
    }

    //display fruit

    public static void displayFruit (Fruit anyFruit) {
        System.out.println("Displaying fruit \n" + anyFruit.toString());// we can write only anyFruit .. toString will come automatically
    }

    //digest better
    public static void digestBetter (Fruit anyFruit) {
//        System.out.println("Digested " + anyFruit + " 4 times");
//        anyFruit.getDigested();
      //  displayFruit(anyFruit); you can do this as well ?

        for (int i = 0; i < 4 ; i++) {
            System.out.println(anyFruit.toString());
        }
    }

    //getMyfavFruit

    public static Fruit getMyFavoriteFruit () {
        //accept no parametre and return your fav fruit object
       // return new Orange("sweet and sour", "orange", 100);
        return new  Apple ("Sweet", "blue", "Ginger");

//        Fruit f = new Orange("sweet and sour", "orange", 100);
//        return f ;
    }

    //create a static method called GetFavoriteByType
    // it has one int parameter
    //return fav.apple object if type is 1 , orange object if type is 2

    public static Fruit getFavoriteByType ( int type ) {
        if (type == 1) {
            return new  Apple ("Sweet", "blue", "Ginger");
        } else if (type == 2 ) {
            return new Orange("sweet and sour", "orange", 100);
        } else {
            return null ;
            //we can return null because :
            // it is a method that returns a reference type
            //null can be assigned to any reference type variable
        }



    }

    //create a utility method that has no return type and accepts fruit object
    //it should display eat method result

    public static void eatFruits (Fruit someFruit) {
        someFruit.eat();
        //if we comment out eat method in Edible interface
        //it will create a compile error in here
        //we can fix it by just creating same abstract method in our Fruit class
        // or return abstract eat method back to Interface
    }




}
