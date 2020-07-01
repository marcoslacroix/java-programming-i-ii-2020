
public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(2);

    }

    public static void printUntilNumber(int number) {
        for (int i = 1; number >= i; i++) {
            System.out.println(i);
        }
    }

}
