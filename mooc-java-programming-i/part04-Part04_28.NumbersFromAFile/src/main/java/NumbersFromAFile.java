
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        try ( Scanner scanTxt = new Scanner(Paths.get(file))) {

            while (scanTxt.hasNextLine()) {
                list.add(scanTxt.nextInt());
            }
        } catch (Exception e) {
            System.out.print("");
        }        
        int count = 0;
        for (int lista : list) {
            if (lista >= lowerBound && lista <= upperBound) {
                count++;
            }
        }
        System.out.println("Numbers: " + count);
    }

}
