package day55;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CourseRunner {

    public static void main(String[] args) {

        List<String> lst = new ArrayList<>(Arrays.asList("Muge","Sumeyye","Hasan","Astrit","Vlad","Zehra"));
        //this is a list we created in one shot and it is also modifiable !we can add and remove!
        //Arrays.asList("Muge","Sumeyye","Hasan","Astrit","Vlad","Zehra") = this would be in one shot without any modification possible 
        
        Course java = new Course("Java",lst);
        System.out.println("java = " + java);
        
        
    }
}
