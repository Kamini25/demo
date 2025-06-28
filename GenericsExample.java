public class GenericsExample {
    // A generic functional interface that takes a type parameter T
    // and defines a method that accepts and returns an object of type T
    // This allows for type-safe operations on various data types.
    // The interface can be used with any type, such as Integer, String, etc.
    // The method can be implemented to perform operations like transformations or calculations.
    // This example demonstrates how to use a generic functional interface in Java.
    // The interface is defined with a single abstract method that takes an input of type T
    // and returns a result of the same type T.

    @FunctionalInterface
    interface GenericFunction<T> {
        T testingFunction(T input);
    }

    public static void main(String[] args) {
        // Using the generic functional interface with Integer
        GenericFunction<Integer> squareFunction = (Integer x) -> x * x;
        System.out.println("Square of 5: " + squareFunction.testingFunction(5));

        // Using the generic functional interface with String
        GenericFunction<String> toUpperCaseFunction = (String s) -> s.toUpperCase();
        System.out.println("Uppercase of 'hello': " + toUpperCaseFunction.testingFunction("hello"));
    }
}