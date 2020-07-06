
import java.util.Scanner;

public class UserInterface {
    
    private TodoList list;
    private Scanner scanner;
    
    public UserInterface(TodoList list, Scanner scanner) {        
        this.list = list;
        this.scanner = scanner;        
    }
    
    public void start() {        
        while (true) {
            
            System.out.print("Command: ");
            String command = scanner.nextLine();
            
            if (command.equals("add")) {
                System.out.print("To add: ");
                String toAddList = scanner.nextLine();
                list.add(toAddList);
            }else if (command.equals("list")){
                list.print();
            }else if (command.equals("remove")) {
                System.out.print("Which one is removed? ");
                int numberToRemove = scanner.nextInt();
                list.remove(numberToRemove);
            }else if (command.equals("stop")) {
                break;
            }
            
        }
        
    }
    
}
