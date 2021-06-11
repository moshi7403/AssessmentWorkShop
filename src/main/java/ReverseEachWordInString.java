public class ReverseEachWordInString {




public static void main(String[] args) {

    /**
     *  Solution-1
     */

    String str = " My name is Mosh";
    String [] words = str.split("\\s");   //

    String reverseWord = "";

    for (String w : words){  //My

        StringBuilder sb = new StringBuilder(w);
        sb.reverse(); //yM

        reverseWord = reverseWord + sb.toString()+" "; //ym eman
    }

    System.out.println(" The reversed word is : "+reverseWord);

    }


    /**
     *  Solution-2
     */


}
