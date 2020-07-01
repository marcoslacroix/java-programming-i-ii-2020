
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true){
            System.out.print("First name: ");
            String nameRead = scanner.nextLine();
            if(nameRead.isEmpty()){
                break;
            }
            System.out.print("Last name: ");
            String lastNameRead = scanner.nextLine();
            System.out.print("Identification number: ");
            String idNumber = scanner.nextLine();
            
            infoCollection.add(new PersonalInformation(nameRead, lastNameRead, idNumber));
        }       
        System.out.println();
        
        for(PersonalInformation allPeople : infoCollection){
            System.out.println(allPeople.getFirstName() + " " + allPeople.getLastName());
        }

    }
}
