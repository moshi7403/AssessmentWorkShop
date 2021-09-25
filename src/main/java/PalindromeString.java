public class PalindromeString {


    public static void main(String[] args) {


        String str = "kayak";
        int len = str.length(); //4
        String rev = "";

        for (int i = len - 1; i >= 0; i--) {  // 3 2 1 0 -1

            rev = rev + str.charAt(i);  //DCBA
        }

        System.out.println(" Solution : ----> : "+ rev);

      //  if(str.equals(rev))

        if (str==rev)
        {
            System.out.println( str + " is Palindrome ");
        }
        else
        {
            System.out.println( str + " is not a Palindrome ");
        }



//different strategy

        String str1 = "pradar";

        StringBuilder sb=new StringBuilder(str1);
        String rev1 =sb.toString();
        System.out.println(rev1);

        if(str1.equals(rev1)){
            System.out.println( str1 + " is Palindrome ");
        }else{
            System.out.println( str1 + " is not a Palindrome ");
        }
    }
}
