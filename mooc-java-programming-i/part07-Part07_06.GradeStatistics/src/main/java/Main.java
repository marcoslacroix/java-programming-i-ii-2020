
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here -- consider breaking the program into 
        // multiple classes.
        System.out.println("Enter point totals, -1 stops:");
        int a = 3;
        int b = 4;
        int c = 5;

        int calculo1 = a * (b + c);
        int calculo2 = ((a + b) * c);
        int calculo3 = (a + b + c) / 5;
        int calculo4 = (a * c * c) + (b * a) + c;

        System.out.printf("Resultados: %d %d %d %d", calculo1, calculo2, calculo3, calculo4);

    }

}
