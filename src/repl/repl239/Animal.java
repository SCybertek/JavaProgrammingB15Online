package repl.repl239;

public abstract class Animal {
     String name;
     int age;

    public void setName(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }



    public abstract int getAgeInHumanYears();

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;

    }
}
