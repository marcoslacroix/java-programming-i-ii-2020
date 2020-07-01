
import java.util.ArrayList;

public class Room {

    private ArrayList<Person> room = new ArrayList<>();

    public Room() {

    }

    public void add(Person person) {
        this.room.add(person);
    }

    public boolean isEmpty() {
        if (this.room.isEmpty()) {
            return true;
        }
        return false;
    }

    public ArrayList<Person> getPersons() {
        return room;
    }

    public Person shortest() {
        if (this.room.isEmpty()) {
            return null;
        }

        Person returnObject = this.room.get(0);

        for (Person ppl : this.room) {
            if (ppl.getHeight() < returnObject.getHeight()) {
                returnObject = ppl;
            }
        }
        return returnObject;
    }

    public Person take() {
        if(this.room.isEmpty()){
            return null;
        }
        Person returnObject = shortest();
        this.room.remove(returnObject);
        return returnObject;
    }

}
