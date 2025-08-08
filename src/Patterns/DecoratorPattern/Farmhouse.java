public class Farmhouse implements BasePizza {
    String description;
    public Farmhouse() {
        description = "Farmhouse";
    }

    public double getCost() {
        return 10.00;
    }
    public String getDescription() {
        return description;
    }
    
}
