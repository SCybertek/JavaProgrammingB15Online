package day51;

public interface UprightFlyable extends Flyable{
    // Flyable is super type of UprightFlyable
// Flyable is more general , UprightFlyable is slightly less general but still abstract idea


        //    public abstract void fly(); == from another interface
        public abstract void flyUpright();
}
