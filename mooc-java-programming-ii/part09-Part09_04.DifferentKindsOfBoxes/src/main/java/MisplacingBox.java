
import java.util.ArrayList;
import java.util.List;

public class MisplacingBox extends Box {

    private int capacity;
    private List<Item> list = new ArrayList<>();
    
    public MisplacingBox() {
        
    }

    @Override
    public void add(Item item) {
        this.list.add(item);
    }

    @Override
    public boolean isInBox(Item comparedItem) {
        return false;
    }

}
