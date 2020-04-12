package selfStudy;

public class Group {
    public void print(){
        System.out.println("Group class lives here");
    }
}
class Baby extends Group{

    @Override
    public void print(){
        System.out.println("Baby lives here");
    }
}
class GrandBaby extends Baby{

@Override
    public void print(){
        // System.out.println("Grandbaby lives here");
    }
}
class Family{
    public static void main(String[] args) {
        GrandBaby g1 = new GrandBaby();
        g1.print();

    }
}