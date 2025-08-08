public class Cheese extends ToppingsDecorator {
    public Cheese(BasePizza pizza) {
        this.pizza = pizza;
    }

    public double getCost() {
        return pizza.getCost() + 1.00;
    }

    public String getDescription() {
        return pizza.getDescription() + "  with Cheese";
    }
    
}
