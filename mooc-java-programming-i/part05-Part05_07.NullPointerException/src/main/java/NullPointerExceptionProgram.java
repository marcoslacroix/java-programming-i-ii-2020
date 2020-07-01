
import java.util.ArrayList;

public class NullPointerExceptionProgram {

    public static void main(String[] args) {
        // Implement a program, or modify a program so, that it causes 
        // the NullPointerException -error
        
        Person p1 = new Person("Pedro", 20);
        
        p1 = null;
        
        p1.aniversario();

    }
}
