
import java.util.ArrayList;

public class ProductWarehouseWithHistory extends ProductWarehouse {
    
    private ChangeHistory ch;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        this.setBalance(initialBalance);      
        this.ch = new ChangeHistory();
        this.ch.add(initialBalance);        
    }

    public String history() {
        return ch.toString();
    }    
    
    @Override
    public String toString() {
        return super.toString();
    }
    
    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        this.ch.add(this.getBalance());        
    }
    
    @Override
    public double takeFromWarehouse(double amount) {
        double realAmount = super.takeFromWarehouse(amount);        
        this.ch.add(this.getBalance());
        return realAmount;        
    }
    
    public void printAnalysis() {
        System.out.println("Product: " + this.getName());
        System.out.println("History: " + this.history());
        System.out.println("Largest amount of product: " + ch.maxValue());
        System.out.println("Smallest amount of product: " + ch.minValue());
        System.out.println("Average: " + ch.average());
    }

}
