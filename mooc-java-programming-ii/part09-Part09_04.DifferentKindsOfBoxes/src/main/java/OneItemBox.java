
import java.util.ArrayList;
import java.util.List;

public class OneItemBox extends Box {

    private int capacity;
    private List<Item> list = new ArrayList<>();

    public OneItemBox() {
        this.capacity = 1;
    }

    @Override
    public void add(Item item) {
        if (this.list.isEmpty()){
            list.add(item);
        }
    }

    @Override
    public boolean isInBox(Item comparedItem) {
        for (Item actualItem : list) {
            if (actualItem.equals(comparedItem)) {
                return true;
            }
        }
        return false;
    }
}
