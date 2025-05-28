import java.util.function.Supplier;
// This code demonstrates the use of a Supplier functional interface in Java.
// A Supplier is a functional interface that represents a supplier of results.
// It has a single abstract method get() that returns a value of a specified type.
// In this example, we create a Supplier that returns a String and print the result.
// The Supplier interface is part of the java.util.function package, which contains many useful functional interfaces.
// The Supplier interface is often used in scenarios where you need to generate or provide values without taking any input parameters.
// The Supplier interface is a key part of Java's functional programming capabilities introduced in Java 8.
// This code is a simple demonstration of how to use the Supplier interface in Java.
public class SupplierCode{
public static void main(String[] args) {
    // Create a Supplier that returns a String
    Supplier<String> strSupplier = ()-> "Welcome to functional interfaces in java!";
    System.out.println("returned string : " + strSupplier.get());
   
}
}