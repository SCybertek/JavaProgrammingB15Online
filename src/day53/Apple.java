package day53;

public class Apple extends Fruit {


    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (!type.equals("macintosh") ){
            this.type = "not allowed";
        }
        this.type = type;
    }
// String taste ;
    //    String color ; we inherited these

    //the moment we generate a subclass it provides us with constructor
    public Apple(String taste, String color, String type) {
        super(taste, color);
        this.type = type;
    }

    @Override
    public void getDigested() {
        System.out.println(type + " apple is " + color + " color" +
                " and it has " + taste + " taste when you digest");
    }

    @Override
    public String toString() {
        return "Apple{" +
                "type='" + type + '\'' +
                ", taste='" + taste + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public void eat() {
        System.out.println("Eat one apple a day to keep doctor away! ");
    }


    public static void main(String[] args) {
        Apple a1 = new Apple("juicy", "blue", "macintosh");
        System.out.println(a1.toString());

        //a1.summation(3,5, 9)


    }
}