public class SwapingNumber {

    public static void main(String[] args) {


        /**
         *  Solution-1
         */

        int a = 10;
        int b = 20;
        System.out.println("Before Swapping ------> " + " A : " + a + "  " + " B : " + b);

        int t = a; // Used third variable
        a=b;
        b=t;

        System.out.println("After Swapping ------> " + " A : " + a + "  " + " B : " + b);


        /**
         *  Solution-2
         */

        int c = 10;
        int d = 20;
        System.out.println("Before Swapping ------> " + " C : " + c + "  " + " D:  " + d);
        c= c+d; //10+20 =30 --> c=30 now
        d= c-d; // 30-20=10 --> d = 10 now
        c= c-d; //30-10 =20 --> c=20 now

        System.out.println("After Swapping ------> " + " C : " + c + "  " + " D : " + d);


        /**
         *  Solution-3
         *  Here e or f value can not be zero . Otherwise it will throw arithmetic exception
         */

        int e = 10;
        int f = 20;
        System.out.println("Before Swapping ------> " + " E : " + e + "  " + " F: " + f);

        e = e*f; // 10*20 = 200
        f= e/f;  // 200/20 = 10
        e = e/f; //200/10 = 20

        System.out.println("After Swapping ------> " + " E : " + e + "  " + " F: " + f);


        /**
         *  Solution-4
         *  Single line solution
         */

        int x = 10;
        int y = 20;
        System.out.println("Before Swapping ------> " + " X : " + x + "  " + " Y : " + y);
        y = x+y - (x=y);     // 10 = 30 - ( x=y)

        System.out.println("Before Swapping ------> " + " X : " + x + "  " + " Y : " + y);

    }
}
