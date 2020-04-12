package selfStudy;

public class GettersSubClass extends PrivateConstantFinal {
    public static void main(String[] args) {

        PrivateConstantFinal test = new PrivateConstantFinal();
        System.out.println(test.getMY_INT());

        //UNIQUE :
        //how it decides ? listen hashset deciding uniqueness using hashCode and equals Method
        //equals method and hasCode method from Object class
        //to provide logic for uniqueness in HashSet, we need to override them



    }


}
