
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int loops = 0;        
        while(true){
            System.out.print("Give a number: ");
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            }
            sum += number;
            loops++;
        }
        System.out.println("Average of the numbers: " + ((double)sum/loops));

    }
}
