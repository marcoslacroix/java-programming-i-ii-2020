
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int count = 0;
        while (true){
            String read = scanner.nextLine();
            if(read.endsWith("end")){
                break;
            }else{
                count++;
            }            
        }
        System.out.println(count);

    }
}
