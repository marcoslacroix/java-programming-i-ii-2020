
import java.util.HashMap;
import java.util.Map;

public class Abbreviations {

    private HashMap<String, String> dict = new HashMap<>();

    public Abbreviations() {

    }

    public void addAbbreviation(String abbreviation, String explanation) {
            dict.put(abbreviation, explanation);
        
    }

    public boolean hasAbbreviation(String abbreviation) {
        if (this.dict.containsKey(abbreviation)) {
            return true;
        } else {
            return false;
        }
    }

    public String findExplanationFor(String abbreviation) {
        if (abbreviation == null) {
            return "";
        }
        abbreviation = abbreviation.toLowerCase();
        return dict.get(abbreviation);
    }
}
