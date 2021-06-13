public class PalindromNumber {

    public static void main(String[] args) {

        int x = 16461;

        StringBuffer inputNumber = new StringBuffer (String.valueOf(x)); // making integer into string
        StringBuffer reversedNumber = inputNumber.reverse();


        if(inputNumber ==reversedNumber)
        {
            System.out.println( inputNumber + " is Palindrome number");
        }
        else
        {
            System.out.println( inputNumber + " is not a Palindrome number");
        }
    }
}
