
import java.util.ArrayList;
import java.util.List;

public class BoxWithMaxWeight extends Box {

    private int capacity;
    private List<Item> list = new ArrayList<>();

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void add(Item item) {

        int actualHeight = this.capacity;
        for (Item actualItem : this.list) {

            actualHeight -= actualItem.getWeight();
        }
        if (item.getWeight() <= actualHeight) {
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
