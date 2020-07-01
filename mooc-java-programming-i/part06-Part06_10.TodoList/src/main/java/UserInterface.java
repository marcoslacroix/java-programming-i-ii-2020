
import java.util.Scanner;

public class UserInterface {
    
    private TodoList lista;
    private Scanner scanner;

    public UserInterface(TodoList lista, Scanner scanner) {
        this.lista = lista;
        this.scanner = scanner;
    }
    
    public void start(){
        
        while(true){
            System.out.print("Command: ");
            String command = scanner.nextLine();
            if(stoping(command)){
                break;
            }else if(adicionar(command)){
                System.out.print("To add: ");
                String addToList = scanner.nextLine();
                lista.add(addToList);
            }else if((listComand(command))){
                lista.print();
            }else if(remove(command)){
                System.out.print("Which one is removed? ");
                int readRemove = Integer.valueOf(scanner.nextLine());
                lista.remove(readRemove);                
            }
            
        }
    }
    
    public boolean remove(String word){
        if(word.equals("remove")){
            return true;
        }
        return false;
    }
    
    public boolean listComand(String word){
        if(word.equals("list")){
            return true;
        }
        return false;
    }
    
    public boolean adicionar(String word){
        if(word.equals("add")){
            return true;
        }
        return false;
    }
    
    public boolean stoping(String word){
        if(word.equals("stop")){
            return true;
        }
        return false;
    }
    
}
