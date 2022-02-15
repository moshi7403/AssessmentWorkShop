public class MissingNumberInArray {

    /**
     * @Scenario: Find the missing number in a given integer array of 1 to 5!
     * @Author: Mosh_R
     * 1. Check if string contains digits
     * 2. Get the sum of the array
     * 3. Get the sum of the range
     * 4. Subtract the range from the sum of the array
     */

    public static void main(String[] args) {

        int arr[]={1,2,4,5};
        int sum1=0;

        for(int i=0; i<arr.length; i++){
            sum1=sum1+arr[i];
        }
        System.out.println("Sum of the elements: "+sum1);

        int sum2 = 0;
        for(int j=0; j<=5; j++){
            sum2=sum2+j;
        }
        System.out.println("Sum of the range: "+sum2);

        System.out.println("The missing element is: "+(sum2-sum1));
    }
}