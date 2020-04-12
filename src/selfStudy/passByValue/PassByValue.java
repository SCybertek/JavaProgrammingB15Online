package selfStudy.passByValue;

public class PassByValue {
    public static void main(String[] args) {

        int a = 10 , b = 20 ;

        changeNum(a);
        System.out.println("a value after changeNum call " + a);

        Student st = new Student(21);
        Student.changeStudent(st);
        System.out.println("st age value after changeStudent: " + st.age);

        Student.chandeStudentAge(st);
        System.out.println("st age value after changeStudentAge: " + st.age);

        switchNum(a,b);
        System.out.println("a val after switchNum method call:" + a + " |b val after switch Num method call val: " + b);

        Student st1 = new Student(30);
        Student st2 = new Student(35);

        Student.switchStudent(st1, st2);
        System.out.println("st1 age val after switchStudent: " + st1.age + " | st2 age val after swtichStudent: " + st2.age ) ;


    }
    static void changeNum (int num) {
        num = num +5;
        System.out.println("num value inside: " + num );
    }

    static void switchNum(int i1 , int i2) {
        int temp = i1 ;
        i1= i2;
        i2 = temp;
        System.out.println("i1 inside val :" + i1 + " |i2 inside val: " + i2);
    }


}
