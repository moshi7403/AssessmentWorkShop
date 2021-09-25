public class RemoveJunkChar {

    public static void main(String[] args) {

        String junk = "&&**((^ Moshiur**^^++_*&^^^&**(";
        String filteredString = junk.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(filteredString);
    }
}