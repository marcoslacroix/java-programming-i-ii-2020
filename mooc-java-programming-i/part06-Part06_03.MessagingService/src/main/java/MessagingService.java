
import java.util.ArrayList;

public class MessagingService {
    
    private ArrayList<Message> messagem;

    public MessagingService() {
        this.messagem = new ArrayList<>();
    }
    
    public void add(Message message){
        if((message.getContent().length() <= 280)){
            this.messagem.add(message);        
        }       
    }
    
    public ArrayList<Message> getMessages(){
        return messagem;
}
    
    
}
