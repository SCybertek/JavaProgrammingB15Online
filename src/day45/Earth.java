package day45;

public class Earth extends Planet {
    
    // double gravity ;
    //    int radius ;
    //    boolean hasLife ;
    int population ;

    @Override
    public String toString() {
        return "Earth{" +
                "population=" + population +
                ", gravity=" + gravity +
                ", radius=" + radius +
                ", hasLife=" + hasLife +
                '}';
    }

    public Earth(double gravity, int radius, boolean hasLife, int population) {
        super(gravity, radius, hasLife);
        this.population = population;
    }


    public static void main(String[] args) {
        
        Earth e1 = new Earth(9.81, 500, true, 700000000);
        System.out.println("e1 = " + e1);
    }

    //practicall usage of using super class constructor :
    //Super( ) keyword to call super class constr. is
    // to reuse the functionality of super class constr. in sub class constructor
}
