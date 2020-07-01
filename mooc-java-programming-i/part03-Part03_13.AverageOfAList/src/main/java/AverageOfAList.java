
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            list.add(input);
        }
        int sum = 0;
        for (int lista : list) {
            sum += lista;
        }
        double avg = (double) sum / list.size();
        System.out.println(sum);
        System.out.println("Average: " + avg);

    }
}
