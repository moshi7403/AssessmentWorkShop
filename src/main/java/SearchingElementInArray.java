public class SearchingElementInArray {

    public static void main(String[] args) {

        int a[] = { 10, 20, 30 , 40, 50, 96, 88};

        int searchEcpectedElement = 40;

        boolean flag = false;

        for (int i=0; i<a.length; i++){

            if(searchEcpectedElement==a[i]){
                System.out.println("Element is found at : " + i);
                flag=true;
                break;
            }
        }

        if (flag==false){

            System.out.println(" Element is not found ");
        }
    }
}
