package day23;

public class ForEachLoopPractice {
    public static void main(String[] args) {
        /*
         * create a long array or 5 items called salaries
         * put your salary amounts that ok for your offer
         *
         * use for each loop to iterate over them
         * and print them out
         *
         *
         * OPTIONALLY : use different for each loop to
         * print only the salary more than 100000
         *
         * find max
         * find min
         *
         * */


        //plain logic:
        //write down the first number as temporarily max number on paper
        //then go throigh each number ans compare number
        //if the number comparing is more then delete your previous number and put new number as max
        //if the number comparing is less, then skip
        //do that until no number left

        // I need to pick up an item from this array so I can compare with other items
        //since first one is right there, I juts decided to pick it up
        //and make it temporarily the max valu e
        //can I pick up the second or third instead??--yes you can!!

        long[] salaries = new long[]{100000L, 110000L, 115000L, 150000L, 130000L};

        long maxSalary = salaries[0];
        for (long salary : salaries) {
            //check if current salary is more
            if (salary > maxSalary) {
                //if so replace the existing value of max with current bigger salary
                maxSalary = salary;
            }

        }
        System.out.println("max salary = " + maxSalary);

        for (int x = 0; x < salaries.length; x++) {
            if (maxSalary < salaries[x]) maxSalary = salaries[x];
        }
        System.out.println("maxSalary = " + maxSalary);


//        long [] salaries = new long []{-100000L, -110000L, -115000L, -150000L, -130000L};
//        // long maxSalary = 0;
//you cannot pick something that you dont have in your ARRAY as initial value !!!

            for (long eachSalary : salaries) {
                System.out.println("each Salary = " + eachSalary);
            }

            for (long salary : salaries) {
//            if (salary> 100000){
//                System.out.println("salary: "+salary);
//            }

                if (salary <= 100000) {
                    continue;
                }
                System.out.println("salary = " + salary);
            }

        }
    }

