
import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {

    private HashMap<LicensePlate, String> dict = new HashMap<>();

    public boolean add(LicensePlate licensePlate, String owner) {
        if (dict.containsKey(licensePlate)) {
            return false;
        } else {
            this.dict.put(licensePlate, owner);
            return true;
        }
    }

    public String get(LicensePlate licensePlate) {
        return this.dict.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (this.dict.containsKey(licensePlate)) {
            this.dict.remove(licensePlate);
            return true;
        }
        return false;
    }

    public void printLicensePlates() {
        for (LicensePlate currentKey : this.dict.keySet()) {
            System.out.println(currentKey);
        }
    }

    public void printOwners() {
        ArrayList<String> owners = new ArrayList<>();
        for (String owner : this.dict.values()) {
            if (!(owners.contains(owner))) {
                System.out.println(owner);
                owners.add(owner);
            }
        }
    }

}
