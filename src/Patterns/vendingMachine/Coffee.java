import java.util.HashMap;
import java.util.Map;

public class Coffee {
    private String name;
    private double price;
    private Map<Ingredients, Integer> receipe;
    // public Coffee(String name, double price, Map<Ingredients, Integer> receipe) {
    //     this.name = name;
    //     this.price = price;
    //     this.receipe = receipe;
    // }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public Map<Ingredients, Integer> getReceipe() {
        return receipe;
    }
    public void setReceipe(Map<Ingredients, Integer> receipe) {
        this.receipe = receipe;
    }
    public void prepareReceipe(Ingredients ingredient , int requiredQuantity){
        
    }
    
}
