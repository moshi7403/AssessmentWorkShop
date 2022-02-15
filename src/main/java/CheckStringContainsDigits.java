public class CheckStringContainsDigits {

    public static void main(String[] args) {

        /**
         * @Scenario: Positive
         * @Author: Mosh_R
         * 1. Check if string contains digits
         */

        String str = "5236841234";
        boolean result = str.matches("[0-9]+");
        System.out.println("Original String : " + str);
        System.out.println("Does string contain only Digits? : " + result);

        /**
         * @Scenario: Negative
         * @Author: Mosh_R
         * 1. Check if string contains digits
         */


        String str1 = "ABCD 1234";
        boolean result1 = str.matches("[0-9]+");
        System.out.println("Original String : " + str1);
        System.out.println("Does string contain only Digits? : " + result1);
    }
}
