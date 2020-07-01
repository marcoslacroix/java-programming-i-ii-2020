
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string: ");
        String str = String.valueOf(scan.nextLine());
        System.out.println("Give an integer: ");
        int inteiro = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double: ");
        double dou = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean: ");
        boolean boo = Boolean.valueOf(scan.nextLine());
        
        System.out.println("You gave the string " + str);
        System.out.println("You gave the integer " + inteiro);
        System.out.println("You gave the double " + dou);
        System.out.println("You gave the boolean " + boo);
    }
}
