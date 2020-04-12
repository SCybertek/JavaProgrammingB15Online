package day54.interface_as_reference;

public class Clothes implements Wearable {

    int size;

    public void wear() {
        System.out.println("We can wear clothes");
    }

}


    class Perfume implements Wearable, Cosmetics {
        @Override
        public void wear() {
            System.out.println("we wear perfume by sprinting all over ourselves:) ");
        }
    }

    class Watch implements Wearable {


        @Override
        public void wear() {
            System.out.println("We wear watch on our hands");

        }
    }

    class MakeUp implements Wearable, Cosmetics {

        @Override
        public void wear() {
            System.out.println("I wear make-up when I go to work");
        }


        public static void main(String[] args) {

            //try out all the polyphromic assignment
            //according to these relationship

            Clothes c1 = new Clothes();
            Wearable c2 = new Clothes();
            Object c3 = new Clothes() ;


            Perfume p1 = new Perfume();
            Wearable p2 = new Perfume();
            Cosmetics p3 = new Perfume();
            Object p4 = new Perfume();

            MakeUp m1 = new MakeUp();
            Cosmetics m2 = new MakeUp();
            Wearable m3 = new MakeUp();
            Object m4 =new MakeUp();


            Watch w1 = new Watch();
            Wearable w2 = new Watch();
            Object w3 = new Watch();




        }
}