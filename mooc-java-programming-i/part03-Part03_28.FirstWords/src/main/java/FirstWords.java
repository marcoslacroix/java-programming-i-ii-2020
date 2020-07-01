
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String read = scanner.nextLine();
            String[] pieces = read.split(" ");

            if (read.equals(" ") || read.equals("")) {
                break;
            } else {
                System.out.println(pieces[0]);
            }
        }

    }
}
