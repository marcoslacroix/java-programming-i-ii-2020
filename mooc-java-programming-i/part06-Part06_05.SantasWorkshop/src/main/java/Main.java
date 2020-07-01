
public class Main {

    public static void main(String[] args) {

        // use this main method to try out your classes!
        Gift book = new Gift("Harry Potter and the Philosopher's Stone", 2);
        Gift secondBook = new Gift("Harry Potter", 4);

        Package pacote = new Package();
        pacote.addGift(book);
        pacote.addGift(secondBook);
        System.out.println(pacote.totalWeight());

    }
}
