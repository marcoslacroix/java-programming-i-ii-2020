
public class Student extends Person {

    private int credits;

    public Student(String name, String street) {
        super(name, street);
        credits = 0;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public int credits() {
        return credits;
    }

    public void study() {
        this.credits += 1;
    }
    
    @Override
    public String toString() {
        return this.getName()
                + "\n  "
                + this.getStreet()
                + "\n  Study credits "
                + this.getCredits();
    }

}
