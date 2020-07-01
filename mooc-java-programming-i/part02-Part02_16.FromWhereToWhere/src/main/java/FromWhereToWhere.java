
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        
        System.out.print("Where to? ");
        int to = Integer.valueOf(scanner.nextLine());
        int from = Integer.valueOf(scanner.nextLine());
        
        while (to >= from){
            System.out.println(from);
            from++;
        }
    }
}
