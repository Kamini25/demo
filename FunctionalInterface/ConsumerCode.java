import java.util.function.Consumer;

public class ConsumerCode {
    public static void main(String[] args) {
        // Create a Consumer that takes a String and prints it
        Consumer<String> printConsumer = (input) -> {
            System.out.println("Consumed: " + input);
        };
        Consumer<Integer> x = (Integer v) -> System.out.println(v); 

        // Use the Consumer to process a sample input
        String sampleInput = "Hello, Functional Interface!";
        printConsumer.accept(sampleInput); // Call the accept method to consume the input
        x.accept(4);
    }
}