package day47;

public final class ExtremeSport extends Sport {

    //this ExtremeSport is final and it measn this child does not to have children

    //So if Class is final --> we CAN NOT EXTEND
    //if method is final --> we can inherit method but CAN NOT CHANGE


   // @Override w ecannot override the final method
    // you can use final method with overloading it
    public void doSomething (int x) {
        super.doSomething (); //this super. calls SUPERS method!
        System.out.println("doing some extreme sport");
    }

    @Override
    // this final keyword is
    // blocking sub class of ExtremeSport
    // to to override this method
//    public final void doSomethingElse() {
    public void doSomethingElse () {
        super.doSomething ();
        System.out.println("doing some extreme sport");
    }

    public static void main(String[] args) {

        ExtremeSport abc = new ExtremeSport() ;
        abc.doSomething(); // we can use call final super method in sub method .but no changing! no reassigning and no Overriding!!

    }

}
