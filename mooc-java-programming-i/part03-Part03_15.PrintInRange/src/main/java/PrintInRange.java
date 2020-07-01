
import java.util.ArrayList;
import java.util.Scanner;

public class PrintInRange {

    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        for (int number : numbers){
            if (number >= lowerLimit && number <= upperLimit){
                System.out.println(number);
            }
        }
        
    }

    public static void main(String[] args) {
        // Try your method here
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(6);
        list.add(-1);
        list.add(5);
        list.add(1);
        System.out.println("The numbers in the range [0, 5]");
        printNumbersInRange(list, 0, 5);

    }

}
