package day62;

import day61.Jobs;

import java.util.TreeSet;

public class JobTreeSet {

    public static void main(String[] args) {

        //create a sorted set of job from day 61
        //with this tree set implementation
        //add 5 jobs and print them out vertically and see what you get 

        TreeSet<Jobs> myJobs = new TreeSet<>();
        myJobs.add(new Jobs("MA", 150000, "Hubspot"));
        myJobs.add(new Jobs("ME", 165000, "StitchFix"));
        myJobs.add(new Jobs("NH", 150000, "Care.com"));
        myJobs.add(new Jobs("NJ", 170000, "Google"));
        myJobs.add(new Jobs("MA", 120000, "Amazon"));
        myJobs.add(new Jobs("NH", 100000, "CarGurus"));
        
//        for (Jobs each: myJobs) {
//            System.out.println("each = " + each);
//
//        }

        //or : Lambda :

        myJobs.forEach(each -> System.out.println("each = " + each));

        //how does hashSet decide 5 person object (name, age) are duplicates or not ?
        //WATCH the SHORT!!



        //we already have compareTo method in Jobs according to salary and now when we put it into a tree Set
        //that automatically sorts and removes duplicates
        // output is going from lowest salary to highest
    }
}
