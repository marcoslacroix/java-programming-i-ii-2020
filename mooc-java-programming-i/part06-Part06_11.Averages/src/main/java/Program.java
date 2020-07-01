
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeRegister newRegister = new GradeRegister();

        UserInterface newInterface = new UserInterface(newRegister, scanner);
        
        newInterface.start();
    }
}
