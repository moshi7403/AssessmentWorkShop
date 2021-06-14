public class EvenAndOddNumberInArrayPrint {

    public static void main(String[] args) {

        /**
         * Approach-1 : Regular For loop
         */


        int a[] = {2,3,6,8,9,5};

        for (int i=0 ; i <a.length ; i++){

            if(a[i]%2==0)

                System.out.println( "Even Number : " + a[i]);
        }


        for (int i=0 ; i <a.length ; i++){

            if(a[i]%2!=0)

                System.out.println( "Odd Number : " + a[i]);
        }


        /**
         * Approach-2 :  For Each loop
         */

        int b[] = {2,3,6,8,9,5};

        for (int value:b){

            if (value%2==0)

                System.out.println("Even Number : " + value);
        }

        for (int value:b){

            if (value%2!=0)

                System.out.println("Odd Number : " + value);
        }

    }
}
