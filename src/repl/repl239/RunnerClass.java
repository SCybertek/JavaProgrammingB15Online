package repl.repl239;

public class RunnerClass {
    public static void main(String[] args) {
        Dog d1 = new Dog("bob",1,"puddle");
        Dog d2 = new Dog("red",5,"rotveller");
        Dog d3 = new Dog("red",5,"rotveller");

        System.out.println(d1.equals(d2) );
        System.out.println(d2.equals(d3));

        System.out.println(d2.getAgeInHumanYears());
        System.out.println(d1.getAgeInHumanYears());

    }
}
