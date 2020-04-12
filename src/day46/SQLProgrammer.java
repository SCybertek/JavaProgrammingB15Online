package day46;

public class SQLProgrammer extends Programmer{

    //access modifier in sub class
    //can have same visibility or more visibility!!


    @Override
    protected void code() {
        super.code();
        System.out.println("This is not just any programmer - SQL");
    }

    @Override
    public void test() {
        //super.test();
        System.out.println("SQL programmer tests");
    }

     public void writeSQLQuery () {
        System.out.println("SQL programmer generates query");
    }

    void createDatabase () {
        System.out.println("SQL programmer creates database");
    }
}
