
import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
    
    HashMap<String, ArrayList<String>> dict;
    
    public StorageFacility() {
        this.dict = new HashMap<>();
    }
    
    public void add(String unit, String item) {
        this.dict.putIfAbsent(unit, new ArrayList<>());        
        this.dict.get(unit).add(item);        
    }
    
    public ArrayList<String> contents(String storageUnit) {
        return this.dict.getOrDefault(storageUnit, new ArrayList<>());      
    }
    
    public void remove (String storageUnit, String item) {
        this.dict.get(storageUnit).remove(item);
        if (this.dict.get(storageUnit).isEmpty()) {
            dict.remove(storageUnit);
        }
    }
    
    public ArrayList<String> storageUnits() {
        ArrayList<String> storageUnits = new ArrayList<String>();
        for (String currentKey : this.dict.keySet()) {
            if (this.dict.get(currentKey).size() != 0) {
                storageUnits.add(currentKey);
            }
        }
        return storageUnits;
        
    }
    
}
