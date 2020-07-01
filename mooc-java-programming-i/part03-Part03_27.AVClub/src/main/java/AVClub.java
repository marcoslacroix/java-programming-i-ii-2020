
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String read = scanner.nextLine();
            String[] pieces = read.split(" ");

            if (read.equals(" ") || read.equals("")) {
                break;
            } else {
                for (String piece : pieces) {
                    if (piece.contains("av")){
                        System.out.println(piece);
                    }
                }
            }
        }

    }
}
