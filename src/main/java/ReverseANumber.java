public class ReverseANumber {

    public static void main(String[] args) {


            /**
             *  Solution-1
             *  Using String Buffer class
             */

            int x = 1234;

            StringBuffer inputNumber = new StringBuffer (String.valueOf(x)); // making integer into string
            StringBuffer reversedNumber = inputNumber.reverse();
            System.out.println("The reversed number is : " + reversedNumber);


        /**
         *  Solution-2
         *  Using String Builder class
         */

        int y = 6789;

        StringBuilder inputNumber1 = new StringBuilder();
        inputNumber1.append(y);
        StringBuilder reversedNumber1 = inputNumber1.reverse();
        System.out.println("The reversed1 number is : " + reversedNumber1);

        }
}
