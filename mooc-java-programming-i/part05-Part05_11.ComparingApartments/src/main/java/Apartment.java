
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.squares) {
            return true;
        }
        return false;
    }

    public int priceDifference(Apartment compared) {
        int own;
        if (this.largerThan(compared)) {
            own = (princePerSquare * squares) - (compared.princePerSquare * compared.squares);
        } else {
            own = (compared.princePerSquare * compared.squares) - (princePerSquare * squares);
        }
        return own;
    }
    
    public boolean moreExpensiveThan(Apartment compared){
        if(this.princePerSquare > compared.princePerSquare){
            return true;
        }
        return false;
    }

}
