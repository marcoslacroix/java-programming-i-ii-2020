public class Product {
    
    private String name;
    private double price;
    private int quantity;
    
    public Product(String initalName, double initialPrice, int initialQuantity){
        this.name = initalName;
        this.price = initialPrice;
        this.quantity = initialQuantity;
    }
    
    public void printProduct(){
        System.out.println(this.name + ", " + this.price + ", " + this.quantity);
    }
    
}
