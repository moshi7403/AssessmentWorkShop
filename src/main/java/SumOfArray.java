public class SumOfArray {

    public static void main(String[] args) {


        /**
         *  Solution-1 : Regualr For loop
         */


        int a[] = {5,2,7,9,6};

        int sum =0;

        for (int i=0 ; i<=a.length-1; i++){

            sum = sum+a[i];

        }

        System.out.println(" Sum of the array with regular forLoop is : " + sum);

        /**
         *  Solution-2 : Enhanced for loop
         */


        int b[] = {5,2,7,9,6};
        int sum1 =0;

        for (int value:b){

            sum1 = sum1+value;
        }

        System.out.println(" Sum1 of the array with enhanced forLoop is : " + sum1);
    }
}
