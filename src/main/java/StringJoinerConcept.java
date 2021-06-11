import java.util.StringJoiner;

public class StringJoinerConcept {

    public static void main(String[] args) {

       // StringJoiner joiner = new StringJoiner(";");  // Different parameters
        StringJoiner joiner = new StringJoiner(";", "{", "}");

        joiner.add("Mohammad")
                .add("Moshiur")
                .add("Rahman");
        System.out.println(joiner.toString());
    }
}
