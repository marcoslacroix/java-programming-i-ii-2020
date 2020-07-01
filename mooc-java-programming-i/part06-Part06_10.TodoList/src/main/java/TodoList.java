
import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> list = new ArrayList<>();

    public TodoList() {
    }

    public void add(String task) {
        this.list.add(task);

    }

    public void print() {
        int count = 1;
        for (String all : list) {
            System.out.println(count + ": " + all);
            count++;
        }
    }

    public void remove(int number) {
        this.list.remove(number - 1);
    }
}
