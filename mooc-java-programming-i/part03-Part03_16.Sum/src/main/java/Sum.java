
import java.util.ArrayList;

public class Sum {
    
    public static int sum(ArrayList<Integer> numbers){
        int sum = 0;
        for (int number : numbers){
            sum += number;
        }
        return sum;
    }

    public static void main(String[] args) {
        // Try your method here
        
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(3);
        list.add(2);
        list.add(6);
        list.add(-1);
        System.out.println(sum(list));
    }

}
