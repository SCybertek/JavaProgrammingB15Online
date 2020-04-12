package repl.repl239;

public class Dog extends Animal {
    String breed ;
    int humanYears ;

    public Dog ( String name, int age , String breed) {
        super(name,age);
        this.breed = breed ;

    }


    @Override
    public boolean equals (Object obj) {
        Dog otherDog = (Dog) obj ;

         return this.name.equals(otherDog.name) &&
                 this.age==otherDog.age &&
                 this.breed.equals(otherDog.breed);

    }

    @Override
    public int getAgeInHumanYears() {
        if ( age <= 2) {
              humanYears = age *11 ;
        } else {
             humanYears = 22 + ((age -2) * 5 ) ;
        }
        return humanYears;

    }
    @Override
    public String toString () {
        return  "Name:" + name + "\n" + "Breed" + this.breed + "\n"
                + "Age in calendar years:" + age + "\n" + "Age in human years:" + humanYears  ;

    }
}
