public class CheckStringContainsLettersAndDigits {



    public static void main(String[] args) {

        /**
         * @Scenario: Positive
         * @Author: Mosh_R
         * 1. Check if string contains letters and digits
         */
        String str = "ABCD1234";
        boolean result = str.matches("^[a-zA-Z0-9]+$");
        System.out.println("Original String : " + str);
        System.out.println("Does string contain letters and Digits? : " + result);

        /**
         * @Scenario: Negative
         * @Author: Mosh_R
         * 1. Check if string contains letters and digits
         */
        String str1 = "1223";
        boolean result1 = str.matches("^(?=.*[A-Z])(?=.*[0-9])[A-Z0-9]+$");
        System.out.println("Original String : " + str1);
        System.out.println("Does string contain letters and Digits? : " + result1);
    }
}
