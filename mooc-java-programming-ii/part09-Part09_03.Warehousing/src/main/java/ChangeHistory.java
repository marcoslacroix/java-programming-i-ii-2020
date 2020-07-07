
import java.util.ArrayList;
import java.util.Collections;

public class ChangeHistory {

    private ArrayList<Double> list = new ArrayList<>();

    public ChangeHistory() {
    }

    public void add(double status) {
        list.add(status);
    }

    public void clear() {
        this.list.clear();
    }

    public String toString() {
        return list.toString();
    }

    public double maxValue() {
        if (this.list.isEmpty()) {
            return 0;
        } else {
            return Collections.max(list);
        }
    }
    
    public double minValue() {
        if (this.list.isEmpty()) {
            return 0;            
        }else {
            return Collections.min(list);                
            }
        }
    
    public double average() {
        if (this.list.isEmpty()) {
            return 0;
        }else {
            double sum = 0;
            for (double n : list) {
                sum += n;
            }
            return sum / list.size();
        }
    }
    
    
    }
