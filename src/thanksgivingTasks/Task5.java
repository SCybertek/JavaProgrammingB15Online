package thanksgivingTasks;

public class Task5 {
    public static void main(String[] args) {
        /*
        given a name with prefix, stored in a String variable called name
for example
    Dr. Dru , Mr. Robot , Ms. Lois , Mrs. Brown
-- in case insensitive condition ----
print as below
if the name Started with (Dr )-->> Doctor
if the name Started with (Mr )-->> Male
if the name Started with (Miss )-->> Single female
if the name Started with (Mrs )-->> Married female
         */
        String name ="Dr. Dru";

        if (name.startsWith("Dr.")){
            System.out.println("Doctor");
        } else if (name.startsWith("Mr.")){
            System.out.println("Male");
        } else if (name.startsWith("Miss")){
            System.out.println("Single female");
        } else if (name.startsWith("Mrs.")){
            System.out.println("Married female");
        }
    }
}
