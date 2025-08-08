public class Mushroom extends ToppingsDecorator {
    public Mushroom(BasePizza pizza) {
        this.pizza = pizza;
    }

    public double getCost() {
        return pizza.getCost() + 3.00;
    }

    public String getDescription() {
        return pizza.getDescription() + "  with Mushroom";
    }
    
}
