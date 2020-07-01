
import java.util.ArrayList;

public class Stack {

    private ArrayList<String> stacks = new ArrayList<>();
    

    public Stack() {        
    }   
    
    public Stack(ArrayList<String> stacks) {
        this.stacks = stacks;
    }

    public boolean isEmpty() {
        if(this.stacks.isEmpty()){
            return true;
        }
        return false;
    }

    public void add(String value) {
        this.stacks.add(value);
    }
    
    public ArrayList<String> values(){
       return stacks;
    }
    
    public String take(){
     
        String strReturn = stacks.get(stacks.size() -1);
        stacks.remove(stacks.size() -1);        
        return strReturn;
    }

}
