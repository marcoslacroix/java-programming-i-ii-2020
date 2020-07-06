
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
        return this.dict.containsKey(abbreviation);
    }

    public String findExplanationFor(String abbreviation) {
        return dict.get(abbreviation);
    }
}
