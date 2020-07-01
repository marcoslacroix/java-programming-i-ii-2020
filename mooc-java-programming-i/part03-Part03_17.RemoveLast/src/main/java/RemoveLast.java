
import java.util.ArrayList;

public class RemoveLast {

    public static void removeLast(ArrayList<String> strings) {
        if(strings.size() > 0){
            strings.remove(strings.size() -1);
        }
    }

    public static void main(String[] args) {
        // Try your method in here
        ArrayList<String> list = new ArrayList<>();
        list.add("First");
        list.add("Second");
        list.add("Third");
        System.out.println(list.size());
        
        System.out.println(list);
        removeLast(list);
        removeLast(list);
        System.out.println(list);
    }

}
