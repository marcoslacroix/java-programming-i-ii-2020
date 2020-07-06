
import java.util.ArrayList;
import java.util.List;

public class TodoList {
    
    private List<String> list = new ArrayList<>();
    
    public TodoList(){        
    }
    
    public void add(String task) {
        list.add(task);        
    }
    
    public void print() {
        int count = 1;
        for (int i = 0; i < list.size(); i++) {
            System.out.println(count + ": " + list.get(i));
            count++;
        }
    }
    
    public void remove(int number) {
        number--;
        list.remove(number);
        
    }
    
}
