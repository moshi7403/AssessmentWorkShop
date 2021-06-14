public class CountOccurrenceInCharString {


    public static void main(String[] args) {


        /**
         *  Solution-1
         *
         */

        String characters = "Java is a programming language";

        int totalCount= characters.length();

        int totalCount_AfterRemoval = characters.replaceAll("a","").length();

        int count = totalCount-totalCount_AfterRemoval;

        System.out.println("Number of occurences : " + count);

    }
}
