public class RemoveJunkChar {

    public static void main(String[] args) {

        String junk = "&&**((^ Moshiur**^^++_*&^^^&**(";
        junk = junk.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(junk);
    }
}