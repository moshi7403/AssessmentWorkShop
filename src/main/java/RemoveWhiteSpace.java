public class RemoveWhiteSpace {

    public static void main(String[] args) {

        String actualSentence = " This is Mosh writing programme ";

        System.out.println("Before removing white space : " + actualSentence);

        String afterRemovalOfWhiteSpace = actualSentence.replaceAll("\\s","");

        System.out.println("After removing white space : " + afterRemovalOfWhiteSpace);
    }
}
