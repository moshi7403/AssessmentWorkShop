public class FindLargestOfThreeNumbers {

    public static void main(String[] args) {

        int a = 20;
        int b = 30;
        int c = 40;

        if (a>b && a>c){

            System.out.println(" A has the largest number : " + a);
        }
        else if (b>a && b>c){

            System.out.println(" B has the largest number : " + b);
        }
        else {
            System.out.println(" C has  the largest number : " + c);
        }

    }
}
