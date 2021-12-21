public class MissingNumberInArray {

    public static void main(String[] args) {


        /**
         * 1. Calculate the sum in the array
         * 2. Calculate the range in the array
         * 3. Deduct the sum of the range from the sum of the actual elements in the array
         */

        int a[] = {1,2,3,4,5,6,8,9};

        int sumOfActualElements = 0;

        for(int i =0; i<a.length; i++){

            sumOfActualElements=sumOfActualElements+a[i];

        }

        System.out.println("Sum of the actual elements "+sumOfActualElements);

        int sumOfRange = 0;

        for(int j=1;j<=9;j++){

            sumOfRange=sumOfRange+j;
        }

        System.out.println("Sum of the range "+ sumOfRange);

        System.out.println("Missing numbers will be "+ (sumOfRange-sumOfActualElements));
    }
}
