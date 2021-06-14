public class CountEvenAndOddDIgitsInANumbers {

    public static void main(String[] args) {

        int num = 123456;
        int even_count = 0;
        int odd_count = 0;

        while (num>0) {    // 123456 12345 1234 123 12 1

            int remainder = num%10;

            if (remainder%2==0){  // 5 4 3 2 1

                even_count++; // 1 2 3
            }
            else {
                odd_count++; // 1 2 3
            }

            num = num/10; // 12345 1234 123 12 1 0
        }

        System.out.println("Even count is  : " + even_count + " And Odd count is " + odd_count );
    }
}
