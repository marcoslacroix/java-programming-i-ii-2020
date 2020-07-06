
import java.util.HashMap;

public class IOU {
    
    
    private HashMap<String, Double> debtRegister = new HashMap<>();

    public IOU(){        
    }
    
    public void setSum(String toWhom, double amount) {
        debtRegister.put(toWhom, amount);
        
    }
    
    public double howMuchDoIOweTo(String toWhom) {
        return this.debtRegister.getOrDefault(toWhom, 0.0);
    }
    
}
