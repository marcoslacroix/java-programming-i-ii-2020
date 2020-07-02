import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Write your program here -- consider breaking the program into 
        // multiple classes.
        UserInterface intface = new UserInterface(new GradeRegister(), new Scanner(System.in));
        intface.start();

    }

}
