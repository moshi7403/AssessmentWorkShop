import java.util.StringTokenizer;

public class CountWordsInAString {

    public static void main(String[] args) {


        /**
          *  Solution-1
         *
         */
        String words = "My name is Mosh";
        StringTokenizer st = new StringTokenizer(words);
        int numberOfWords = st.countTokens();
        System.out.println( "Total number of words : "+numberOfWords);


        /**
         *  Solution-2
         *
         */

        String words2 = " Please count the words ";
        String[] wordsInArray = words2.trim().split("\\s+");
        System.out.println(" The count is = "+(wordsInArray.length));



        String a = "Some String";
        int count = 0;
        for (int i = 0; i < a.length(); i++) {

            if (Character.isWhitespace(a.charAt(i))) {
                count++;
            }
        }
        System.out.println(count+1);
    }
}
