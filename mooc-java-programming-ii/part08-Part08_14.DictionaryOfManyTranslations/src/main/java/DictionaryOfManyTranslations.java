
import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
    
    private HashMap<String, ArrayList<String>> dict;
    
    public DictionaryOfManyTranslations() {
        this.dict = new HashMap<>();
    }
    
    public void add(String word, String translation) {    
        this.dict.putIfAbsent(word, new ArrayList<>());        
        ArrayList<String> listTranslation = this.dict.get(word);
        listTranslation.add(translation);        
    }
    
    public ArrayList<String> translate(String word) {
        ArrayList<String> listWord = this.dict.getOrDefault(word, new ArrayList<>());        
        return listWord;        
    }
    
    public void remove(String word) {  
        this.dict.remove(word);
    }
    
}
