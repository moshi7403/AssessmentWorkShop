public class PalindromeString {


    public static void main(String[] args) {


        String str = "kayak";
        int len = str.length(); //4
        String rev = "";

        for (int i = len - 1; i >= 0; i--) {  // 3 2 1 0 -1

            rev = rev + str.charAt(i);  //DCBA
        }

        System.out.println(" Solution : ----> : "+ rev);

        if(str.equals(rev))
        {
            System.out.println( str + " is Palindrome ");
        }
        else
        {
            System.out.println( str + " is not a Palindrome ");
        }

    }
}
