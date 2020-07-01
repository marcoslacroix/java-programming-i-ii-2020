
import java.util.Scanner;

public class UserInterface {

    private JokeManager jokeManager;
    private Scanner scanner;

    public UserInterface(JokeManager jokeManager, Scanner scanner) {
        this.jokeManager = jokeManager;
        this.scanner = scanner;
    }

    public void start() {
        System.out.println("What a joke!");
        while (true) {

            System.out.println("Commands:");
            System.out.println(" 1 - add a joke");
            System.out.println(" 2 - draw a joke");
            System.out.println(" 3 - list jokes");
            System.out.println(" X - stop");
            String read = scanner.nextLine();

            if (read.equals("X")) {
                break;
            }if (read.equals("1")) {
                System.out.println("Write the joke to be added:");
                String readJoke = scanner.nextLine();
                jokeManager.addJoke(readJoke);
            } else if (read.equals("2")) {
                System.out.println(jokeManager.drawJoke());
            } else if (read.equals("3")) {
                jokeManager.printJokes();
            }

        }
    }

}
