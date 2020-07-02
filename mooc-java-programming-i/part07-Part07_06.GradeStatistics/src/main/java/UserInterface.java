
import java.util.Scanner;

public class UserInterface {

    private GradeRegister register;
    private Scanner scanner;

    public UserInterface(GradeRegister gradeRegister, Scanner scanner) {
        this.register = gradeRegister;
        this.scanner = scanner;
    }

    public void start() {
        System.out.println("Enter total points, -1 stops: ");

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }
            register.add(number);
        }
        if (register.average() != -1) {
            System.out.println("Point average (all): " + register.average());
        } else {
            System.out.println("Point average (all):-");
        }

        if (register.averageGradesAboveGrade(50) != -1) {
            System.out.println("Point average (passing): " + register.averageGradesAboveGrade(50));
        } else {
            System.out.println("Point average (passing):-");
        }

        System.out.println("Pass percentage: " + register.percentageAboveGrade(50));

        System.out.println("Grade distribution:");
        StartPrinter printer = new StartPrinter();
        printer.printer(register.convertGradeScaleToPointScale());
    }

}
