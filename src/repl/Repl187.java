package repl;

import java.util.Arrays;

public class Repl187 {
    public static void main(String[] args) {

        //System.out.println(lameDb("1etsy#2wooden#3spoon", "add", "4", "aaa"));
        System.out.println(lameDb("1test#2bla#3foo", "edit", "2", "bbb"));
        System.out.println(lameDb("1tst#2bla#3foo", "delete", "1", ""));
        //System.out.println(lameDb("1tst#2bla#3foo", "none", "1", ""));

    }

    public static String lameDb(String db, String op, String id, String data) {

        String result = "";
        String[] arrayDb = db.split("#");


        if (op.equals("add")) {
            result = db + "#" + id + data; //assuming that adding is only to the end of string
            return result;
        } else if (op.equals("edit")) {
            for (int i = 0; i < arrayDb.length; i++) { // 1test, 2foo 3 blabla
                if (arrayDb[i].substring(0, 1).equals(id)) {
//                     String temp  = arrayDb[i];
//                     arrayDb[i] = data;
//                     data = temp;
                    db.replace(arrayDb[i] + "", ""+id + data);
                    return Arrays.toString(arrayDb );
                }

            }
        } else if (op.equals("delete")) {
            for (int i = 0; i < arrayDb.length; i++) { // 1test, 2foo 3 blabla
                if (arrayDb[i].substring(0, 1).equals(id)) {
                    db.replace(arrayDb[i] + "", "");
                    return db;
                }
            }
        }

            return db;


    }
}
//String db : holds the whole lame database as a string. You will modify this parameter value depending on operation requested
//
//String op : op is short for operation, the operation the method will do on the database,
//there are 3 : add, edit and delete. For any other operation, return the database as is.
//
//String id : holds the id of the database row we want to manipulate, we use the id to find the
//database row we want to manipulate
//
//String data : holds a string of data we will use for the add or edit operations
//m.lameDb("1etsy#2wooden#3spoon","add","4","aaa")
//        returns:  1etsy#2wooden#3spoon#4aaa
//        (since operation is 'add', we added '#4aaa' to the end and return)