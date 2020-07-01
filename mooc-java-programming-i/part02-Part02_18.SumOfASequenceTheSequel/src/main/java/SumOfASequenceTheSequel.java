
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("First number? ");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.print("Last number? ");
        int last = Integer.valueOf(scanner.nextLine());

        int sum = first;
        int othersum = 0;
        while (true) {            
            othersum+=sum;
            sum++;
            if (last > first){
                break;
        }            
        }
        System.out.println(othersum);

    }
}
