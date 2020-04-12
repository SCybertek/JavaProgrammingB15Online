package day53;

public class Orange extends Fruit {

    int VClevel ;

    public Orange(String taste, String color, int VClevel) {
        super(taste, color);
        this.VClevel = VClevel ;
    }

    @Override
    public void getDigested() {
        System.out.println("Orange is " + color + " color" +
                " and it has " + taste + " taste when you digest and vitamins:" + VClevel);
    }

    @Override
    public String toString() {
        return "Orange{" +
                "VClevel=" + VClevel +
                ", taste='" + taste + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public void eat() {
        System.out.println("Eat lots of Orange during Winter months");
    }
}
