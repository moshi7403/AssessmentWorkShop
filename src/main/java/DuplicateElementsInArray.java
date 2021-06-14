public class DuplicateElementsInArray {

    public static void main(String[] args) {

        String elements[] = { "Java", "Python", "C++" , "C#", "Java"};
        boolean flag = false;

        for ( int i=0; i<elements.length; i++){

            for( int j=i+1; j<elements.length; j++){

                if(elements[i]==elements[j]){
                    System.out.println("Found the duplicate elements : " + elements[i]);
                    flag=true;
                }
            }
        }

        if(flag==false){

            System.out.println("Duplicate elements not found !!");
        }
    }
}
