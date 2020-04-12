package officeHour.mira_02_25;

public class StringBuilderStringBufferNotes {
    public static void main(String[] args) {


        /**StringBuilder --> mutable  - not thread safe - fast
                *StringBuffer --> synchronized - thread safe - very slow
                *       when object is synchronized it can be access by multiple threads
                *
*  QA: if you know that you need to do some manipulations on String;
*      which class you will use  ==> StringBuilder  or StringBuffer ?
*
*  Answer : it depends depends if we need any synchronization ;
*
*           if i don't need that object to be thread safe i go over StringBuilder it is faster
                *           but it can not be reached by multiple threads
*
*           if we need just to store some String we would always want to use String
*
* Multithreading - StringBuffer and StringBuilder.
* If your text can change and will only be accessed from a single thread,
* use a StringBuilder because StringBuilder is unsynchronized.
                * If your text can changes, and will be accessed from multiple threads,
* use a StringBuffer because StringBuffer is synchronized
*/
    }
}
