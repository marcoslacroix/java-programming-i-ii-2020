
public class StartPrinter {

    public StartPrinter() {
    }

    public void printer(int[] points) {
        for (int i = (points.length - 1); i >= 0; i--) {
            String stars = "";
            int count = points[i];
            for (int j = count; j > 0; j--) {
                stars += "*";
            }
            System.out.println(i + ": " + stars);
        }
    }

}
