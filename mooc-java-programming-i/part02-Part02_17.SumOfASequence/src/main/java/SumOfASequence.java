
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Last number? ");
        int number = Integer.valueOf(scanner.nextLine());
        
        int sum = 0;
        int loops = 1;
        while (number > 0){
            sum += loops;
            number--;
            loops++;
        }
        System.out.println(sum);

    }
}
