
import java.util.ArrayList;
import java.util.Random;

public class JokeManager {

    private ArrayList<String> jokes = new ArrayList<>();

    public JokeManager() {
    }

    public void addJoke(String joke) {
        this.jokes.add(joke);
    }

    public String drawJoke() {
        System.out.println("Printing the jokes.");

        if (this.jokes.isEmpty()) {
            return "Jokes are in short supply.";
        }

        Random draw = new Random();
        int index = draw.nextInt(this.jokes.size());
        return this.jokes.get(index);

    }

    public void printJokes() {
        System.out.println("Printing the jokes.");

        for (String each : this.jokes) {
            System.out.println(each);
        }
    }

}
