
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = 0;
        int second = 0;

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            String input = scan.nextLine();

            String[] parts = input.split(" ");
            String command = parts[0];
            if (command.equals("add")) {
                if (Integer.valueOf(parts[1]) >= 100) {
                    first = 100;
                } else {
                    if (first + Integer.valueOf(parts[1]) > 100) {
                        first = 100;
                    } else if (Integer.valueOf(parts[1]) > 0) {
                        first += Integer.valueOf(parts[1]);
                    }
                }
            }
            if (command.equals("move")) {

                if (first > 0) {
                    if (Integer.valueOf(parts[1]) >= 100 || second + Integer.valueOf(parts[1]) >= 100) {
                        second = 100;
                        first = 0;
                    } else if (Integer.valueOf(parts[1]) > 0) {
                        if (Integer.valueOf(parts[1]) > first) {
                            second += first;
                            first = 0;
                        } else {
                            second += Integer.valueOf(parts[1]);
                            first -= Integer.valueOf(parts[1]);
                        }
                    }
                }
            }
            if(command.equals("remove")){
                
                if(second > 0){
                    if(Integer.valueOf(parts[1]) > second){
                        second = 0;
                    }else{
                        second -= Integer.valueOf(parts[1]);
                    }
                }
                
            }

            if (input.equals("quit")) {
                break;
            }
        }
    }

}
