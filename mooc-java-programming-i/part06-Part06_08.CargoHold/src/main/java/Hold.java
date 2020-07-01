
import java.util.ArrayList;

public class Hold {

    private int maxWeight;
    private ArrayList<Suitcase> holdItem = new ArrayList<>();

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public int totalWeight() {
        int total = 0;
        for (Suitcase max : holdItem) {
            total += max.totalWeight();
        }
        return total;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (!(this.totalWeight() + totalWeight() > this.maxWeight)) {
            this.holdItem.add(suitcase);
        }
    }
    
    public void printItems(){
        for(Suitcase all : holdItem){
            all.printItems();
        }
    }

    public String toString() {
        return this.holdItem.size() + " suitcases" + "(" + this.totalWeight() + " kg)";
    }

}
