package day55;

import java.util.List;

public class Course {

    String subject ;
    List<String> studentNames ;
    //String [] sudentNames : this will work as well


    public Course(String subject, List<String> studentNames) {
        this.subject = subject;
        this.studentNames = studentNames;
    }

    @Override
    public String toString() {
        return "Course{" +
                "subject='" + subject + '\'' +
                ", studentNames=" + studentNames +
                '}';
    }
}
