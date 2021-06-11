public class CountOccurrenceInCharString {


    public static void main(String[] args) {


        /**
         *  Solution-1
         *
         */

        String testString = "abcd";
        int replace = testString.length() - testString.replace(".", "").length();
        System.out.println("replace = " + replace);


        String s = "a.b.c.d";
        int charCount = s.length() - s.replaceAll("\\.", "").length();
        System.out.println(charCount);
    }
}
