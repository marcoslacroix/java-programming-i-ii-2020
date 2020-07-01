
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which file should have its contents printed? ");
        String strRead = scanner.nextLine();

        try (Scanner scanTxt = new Scanner(Paths.get(strRead))) {
            
            while(scanTxt.hasNextLine()){
                String linha = scanTxt.nextLine();
                System.out.println(linha);
            }
            }catch(Exception e){
                System.out.println("Error: " + e.getMessage());
                
                }

        }
    }
