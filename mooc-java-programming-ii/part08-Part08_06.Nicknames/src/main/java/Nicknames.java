
import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations required here!
        HashMap<String, String> numbers = new HashMap<>();
        numbers.put("Uno", "One");
        numbers.put("Dos", "Zwei");
        numbers.put("Uno", "Ein");

        String translation = numbers.get("Uno");
        System.out.println(translation);

        System.out.println(numbers.get("Dos"));
        System.out.println(numbers.get("Tres"));
        System.out.println(numbers.get("Uno"));
    }

}
