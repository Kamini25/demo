import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CoffeeMachine {
    private static CoffeeMachine instance;
    HashMap<String, Ingredients> ingredientsList = new HashMap<>();
    List<Coffee> coffeeMenu = new ArrayList<>();

    public synchronized static CoffeeMachine getInstance(){
        if(instance == null){
            return new CoffeeMachine();
        }
        return instance;
    }
    private CoffeeMachine(){
       // initializeIngredients();
        prepareMenu();
        //prepare coffee menu
       // initialize ingredients
    }
    public void initializeIngredients(){
       
        // ingredientsList.put("CocoPowder",new Ingredients("cocoPowder", 10));
        // ingredientsList.put("Water", new Ingredients("water", 20));
        // ingredientsList.put("Milk", new Ingredients("milk", 10));
        
    }
    public void prepareMenu(){
        HashMap<Ingredients,Integer> receipe = new HashMap<>();
        receipe.put(ingredientsList.get("CocoPowder"), 2);
        receipe.put(ingredientsList.get("Water"),1);
        Coffee Espresso = new Coffee("Espresso",3.0, receipe );
        coffeeMenu.add(Espresso);

        receipe.clear();
        receipe.put(ingredientsList.get("Milk"), 2);
        receipe.put(ingredientsList.get("Water"),1);
        Coffee Latte = new Coffee("Latte", 10, receipe);
        coffeeMenu.add(Latte);

    }
    public void displayMenu(){
        System.out.println("Displaying coffee menu");
        for(Coffee coffee: coffeeMenu){
            System.out.println("Name: " + coffee.getName() + "   Price " + coffee.getPrice());
        }
    }

    public void addIngredient(String name, int quantity ){
        Ingredients ingredient = new Ingredients(name, quantity);
        ingredientsList.put(name, ingredient);
    }
}
