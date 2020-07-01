
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int loop = Integer.valueOf(scanner.nextLine());
        int i = 0;
        while(true){
            System.out.println(i);
            i++;
            if(i > loop){
                break;
            }
        }
    }
}
