public class Mexican implements BasePizza {
    String description;
    public Mexican() {
        description = "Mexican";
    }

    public double getCost() {
        return 12.00;
    }
    public String getDescription() {
        return description;
    }
    
}
