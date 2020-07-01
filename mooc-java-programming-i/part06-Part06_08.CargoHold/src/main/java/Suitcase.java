
import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Item> items = new ArrayList<>();
    private int maxWeight;

    public Suitcase(int weight) {
        this.maxWeight = weight;
    }

    public int totalWeight() {
        int total = 0;
        for (Item max : items) {
            total += max.getWeight();
        }
        return total;
    }

    public void addItem(Item item) {
        if (!(this.totalWeight() + item.getWeight() > this.maxWeight)) {
            this.items.add(item);
        }
    }

    public void printItems() {
        for (Item all : items) {
            System.out.println(all);
        }
    }

    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        Item referencia = this.items.get(0);
        for (Item all : items) {
            if (all.getWeight() > referencia.getWeight()) {
                referencia = all;
            }
        }
        return referencia;
    }

    public String toString() {
        String vaziu = "no";
        if (this.items.isEmpty()) {
            return vaziu
                    + " items"
                    + "("
                    + this.totalWeight()
                    + " kg)";
        } else if (this.items.size() == 1) {
            return this.items.size()
                    + " item"
                    + "("
                    + this.totalWeight()
                    + " kg)";
        }
            return this.items.size()
                    + " items"
                    + "("
                    + this.totalWeight()
                    + " kg)";
    }

}


