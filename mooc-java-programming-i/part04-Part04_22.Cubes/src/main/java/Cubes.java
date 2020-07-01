
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true){
            String read = scanner.nextLine();
            if(read.endsWith("end")){
                break;
            }
            int number = Integer.valueOf(read);
            System.out.println(number * number * number);            
        }
        

    }
}
