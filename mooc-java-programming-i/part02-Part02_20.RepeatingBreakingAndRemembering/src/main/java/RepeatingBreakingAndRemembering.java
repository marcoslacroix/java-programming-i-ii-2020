
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give numbers: ");
        int sum = 0;
        int loops = 0;
        int par = 0;
        int impar = 0;
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number > 0) {
                loops++;
                sum += number;
                if (number % 2 == 0) {
                    par++;
                } else {
                    impar++;
                }
            }
            if (number == -1) {
                break;
            }
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + loops);
        System.out.println("Average: " + ((double) sum / loops));
        System.out.println("Even: " + par);
        System.out.println("Odd: " + impar);
    }
}
