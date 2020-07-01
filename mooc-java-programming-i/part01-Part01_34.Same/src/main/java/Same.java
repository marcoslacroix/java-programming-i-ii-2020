
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here. 
        System.out.println("Enter the first string: ");
        String str = String.valueOf(scan.nextLine());
        System.out.println("Enter the second string: ");
        String str2 = String.valueOf(scan.nextLine());
        
        if (str.equals(str2)){
            System.out.println("Same");
        }else{
            System.out.println("Different");
        }
    }
}
