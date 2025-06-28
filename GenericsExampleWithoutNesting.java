public class GenericsExampleWithoutNesting<T> {
    // Generic type T is used to define the type of value stored in this class
    // Instance variable to hold the value of type T
    // This class does not use any nested classes or interfaces
    // The class can be used with any type, such as Integer, String, Double, etc.
    // This allows for type safety and flexibility in the code
    // The class can be instantiated with different types without needing to change the code
    // The class can be used to store and retrieve values of any type specified at runtime
    
   private T value;
   public GenericsExampleWithoutNesting(T value) {
        this.value = value;
    }
    

    // Getter method to retrieve the value
   public T getValue(){
        return value;
    }
    void setValue(T value) {
        this.value = value;
    }
    public static void main(String[] args) {
        GenericsExampleWithoutNesting<Integer> intExample = new GenericsExampleWithoutNesting<Integer>(22);
        System.out.println("Integer value: " + intExample.getValue());
        GenericsExampleWithoutNesting<String> stringExample = new GenericsExampleWithoutNesting<String>("Hello Generics");
        System.out.println("String value: " + stringExample.getValue());
        GenericsExampleWithoutNesting<Double> doubleExample = new GenericsExampleWithoutNesting<Double>(3.14);
        System.out.println("Double value: " + doubleExample.getValue());
    }
}