
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int largura) {
        // part 2 of the exercise
        int spaces = largura;
        for (int i = 1; i <= largura; i++) {
            printSpaces(spaces -= 1);
            printStars(i);

        }
    }

    public static void christmasTree(int altura) {
        // part 3 of the exercise

        int i = 0;
        while (i < altura) {
            printSpaces(altura - (i + 1));
            printStars(2 * i + 1);
            i++;
        }
        int n = 1;
        for (n = 1; n < 3; n++) {
            printSpaces(altura - 2);
            printStars(3);
        }

    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.
//        printTriangle(4);
//        System.out.println("---");
        christmasTree(10);
//        System.out.println("---");
//        christmasTree(10);
    }
}
