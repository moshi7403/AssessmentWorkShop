import java.io.*;
import java.util.Scanner;

public class ReadDataFromTextFile {

    public static void main(String[] args) throws IOException {


        /**
         *  Solution-1
         *
         */

        FileReader file = new FileReader("/Users/mohammadmoshiurrahman/IdeaProjects/" +
                "SolutionLab/src/main/resources/ReadDataFromTextFile");

        BufferedReader  readText = new BufferedReader(file);

        String textsOnTheFile;

        while ((textsOnTheFile = readText.readLine())!=null){

            System.out.println(textsOnTheFile);
        }

        readText.close();

        /**
         *  Solution-2
         *
         */

        File file2 =  new File ("/Users/mohammadmoshiurrahman/IdeaProjects/" +
                "SolutionLab/src/main/resources/ReadDataFromTextFile");

        Scanner sc = new Scanner(file2);

        while (sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
    }
}
