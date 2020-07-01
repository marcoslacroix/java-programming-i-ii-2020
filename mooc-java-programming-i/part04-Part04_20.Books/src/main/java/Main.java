import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        ArrayList<Book> livros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true){
            System.out.print("Title: ");
            String titulo = scanner.nextLine();
            if(titulo.isEmpty()){
                break;
            }
            System.out.print("Pages: ");
            int paginas = Integer.valueOf(scanner.nextLine());
            System.out.print("Publication year: ");
            int ano = Integer.valueOf(scanner.nextLine());
            
            livros.add(new Book(titulo, paginas, ano));
        }
        System.out.println();
        System.out.print("What information will be printed? ");
        String info = scanner.nextLine();
        
        for (Book livro : livros){
            if(info.equals("everything")){
                System.out.println(livro);
            }
            if(info.equals("name")){
                System.out.println(livro.getTitle());
            }
        }

    }
}
