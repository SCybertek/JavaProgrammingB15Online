package day61;

import java.util.*;
import java.util.concurrent.Callable;

public class JobHunter {
    public static void main(String[] args) {
        
        Jobs j1 = new Jobs("GA", 12000, "BOFA");
        Jobs j2 = new Jobs("VA",167000, "Amazon");
        System.out.println("j2.compareTo(j1) = " + j2.compareTo(j1));

        List<Jobs> myJobs = new LinkedList<>();
        myJobs.add(new Jobs("Boston",120000, "Hubspot"));
        myJobs.add(new Jobs("Boston",150000, "Amazon"));
        myJobs.add(new Jobs("Boston",10000, "CarGurus"));
        myJobs.add(new Jobs("LA",160000, "Google"));
        myJobs.add(new Jobs("DC",200000, "Borax"));
        myJobs.add(j1);
        myJobs.add(j2);

        
        System.out.println("myJobs = " + myJobs);
        Collections.sort(myJobs);
        System.out.println("myJobs reverse first time = " + myJobs);

        // use iterator to iterate over List<Job>
        // remove jobs less than 100K salary

        Iterator<Jobs> myIter = myJobs.iterator();
        while ( myIter.hasNext()) {
            if (myIter.next().getSalary() < 100000 ) {
                myIter.remove();
            }
        }
        System.out.println("myJobs = " + myJobs);

        //comparator interface has static method called Reverse ORder!
        //it takes whatever order we have and reverse it
        // it will not change the orginal but create sthe copy and reverse it and prints
        // Comparator.reverseOrder() will give you an object with reversed comparing logic
        Collections.sort(myJobs, Comparator.reverseOrder());
        System.out.println("myJobs after reverse logic= " + myJobs);
        //if we want to change the sorting requirements later:
        // //like sorting by location and then by salary again
        // to have a dynamic custom time comparing is whwre Comparator comes in!! IMPORTANT (we do NOT go back to compareTo and keep overriding it )
        
        //can we acces to the natural once again? looks like no
        System.out.println("myJobs = " + myJobs);

//  Collections.reverseOrder() will also give you an object with reversed comparing logic
        //  below code will try to sort the list in reverse order from natural order
        Collections.reverseOrder() ;
        System.out.println("myJobs reverse 3= " + myJobs);
        //will also give an object with reversed comparing logic
        //last one does not give the reverse right now.. because it was already reversed 
    }
    // what's the difference between Collections.reverseOrder()
    // and Comparator.reverseOrder()
    // both of them will give you an Comparator object with reversed logic
    // they are just at two different place
    // one is the static method of Comparator interface
    // another is static method of Collections class
    // no functional difference at all , they happen to have same name
}
