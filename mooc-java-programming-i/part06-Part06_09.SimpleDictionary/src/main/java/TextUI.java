
import java.util.Scanner;

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {

        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();

            if (command(command)) {
                System.out.println("Bye bye");
                break;
            } else if (add(command)) {
                System.out.print("Word: ");
                String word = scanner.nextLine();
                System.out.print("Translation: ");
                String translation = scanner.nextLine();
                dictionary.add(word, translation);
            } else if (search(command)) {
                System.out.print("To be translated: ");
                String toBeTranslated = scanner.nextLine();
                String traducao = dictionary.translate(toBeTranslated);
                if (traducao == null) {
                    System.out.println("Word " + toBeTranslated + " was not found");
                } else {
                    System.out.println("Translation: " + dictionary.translate(toBeTranslated));
                }
            } else {
                System.out.println("Unknown command");
            }
        }
    }

    public boolean command(String command) {

        if (command.equals("end")) {
            return true;
        }
        return false;
    }

    public boolean add(String command) {

        if (command.equals("add")) {
            return true;
        }
        return false;
    }

    public boolean search(String command) {

        if (command.equals("search")) {
            return true;
        }
        return false;
    }

}
