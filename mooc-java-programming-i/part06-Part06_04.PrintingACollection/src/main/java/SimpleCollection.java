
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {

        String itemOnList = "";
        if (elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        }
        for (String elemento : elements) {
            itemOnList = itemOnList + "\n" + elemento;
        }
        if (elements.size() == 1) {
            return "The collection " + this.name + " has " + this.elements.size() + " element:" + itemOnList;
        } else {
            return "The collection " + this.name + " has " + this.elements.size() + " elements:" + itemOnList;
        }
    }
}
