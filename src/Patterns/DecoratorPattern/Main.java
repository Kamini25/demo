public class Main {
    public static void main(String[] args) {
        BasePizza pizza = new Mexican();
        System.out.println(pizza.getDescription() + " costs " + pizza.getCost());
        pizza = new Cheese(pizza);
        System.out.println(pizza.getDescription() + " costs " + pizza.getCost());
        pizza = new Cheese(pizza);
        System.out.println(pizza.getDescription() + " costs " + pizza.getCost());
        pizza = new Mushroom(pizza);
        System.out.println(pizza.getDescription() + " costs " + pizza.getCost());
        pizza = new Farmhouse();
        System.out.println(pizza.getDescription() + " costs " + pizza.getCost());
        pizza = new Cheese(pizza);
        System.out.println(pizza.getDescription() + " costs " + pizza.getCost());
        
    }
    
}
