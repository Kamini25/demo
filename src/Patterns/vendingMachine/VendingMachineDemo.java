import java.util.HashMap;

public class VendingMachineDemo{
    public static void main(String args[]){
        CoffeeMachine coffeeMachine  = CoffeeMachine.getInstance();

        //add ingredient
        //add coffee with required receipe

        //coffeeMachine.displayMenu();
        coffeeMachine.addIngredient("Milk", 10);
        coffeeMachine.addIngredient("CocoPowder",10);
        coffeeMachine.addIngredient("Water", 10);
        
        //add coffee along with receipe
        //prepare receipe
        Coffee espressoCoffee = new Coffee();
        espressoCoffee.setName(CoffeeType.ESPRESSO.toString());
        espressoCoffee.setPrice(20);
        HashMap<String, Integer> receipeMap = new HashMap<>();
        receipeMap.put("Milk", 2);
        receipeMap.put("water", 2);

        espressoCoffee.prepareReceipe()
        espressoCoffee.se

        //coffeeMachine.dispenseCoffee(CoffeeType.ESPRESSO.toString());
    }
}