package repl;

public class Repl181_185 {

//181
    public static int wordCount(String words) {
        String [] splitted = words.split (" ");
        int count = splitted.length ;

        return count ;
    }

    //182
    public static String clean (String text ,String badWord) {

   // if (text.contains(badWord))
         return text.replace(badWord, "");

   // return text;

    }

//183
    public static String limit(String text, int maxLength)
    {

        String newText = "";

        for (int i = 0; i < maxLength; i++)
            newText += text.charAt(i);
            return newText;

    }

    //184
    public static String at3(String target,String word)
    {

        String newTarget = "";
        for (int i = 0; i < target.length(); i++) {
            newTarget += target.charAt(i);

            if( i == 2) {
                newTarget += word;
            }

        }
        return  newTarget ;
    }

    //184 - longest
    public static String biggerS(String a ,String b)
    {
       if (a.length() > b.length())
           return a;
       else
           return b;
    }


    public static void main(String[] args) {

        System.out.println(wordCount("foo bar")) ;
        System.out.println(clean("one two three", "two"));
        System.out.println(limit("abcd",2));
        System.out.println(at3("longword","foo"));
    }
}
