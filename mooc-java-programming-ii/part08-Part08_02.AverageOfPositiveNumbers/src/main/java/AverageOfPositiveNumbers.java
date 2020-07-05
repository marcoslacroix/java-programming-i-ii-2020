
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        List<Double> list = new ArrayList<>();
        double soma = 0;
        while (true) {
            double number = scanner.nextDouble();
            if (number == 0) {
                break;
            }
            if (number > 0) {
                list.add(number);
                soma += number;
            }
        }
        if (list.isEmpty()) {
            System.out.println("Cannot calculate the average");
        }else {
            System.out.println(soma / list.size());
        }
        
        
        
        

    }
}
