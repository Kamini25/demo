import java.util.function.Predicate;
/**
 * This class demonstrates the use of a Predicate to filter even number.
 */
public class PredicateCode {
    public static void main(String[] args) {
        // Create a Predicate to check if a number is even
        Predicate<Integer> isEven = number -> number % 2 == 0;

        // Test the Predicate with some numbers
        System.out.println("Is 4 even? " + isEven.test(4)); // true
        System.out.println("Is 5 even? " + isEven.test(5)); // false
        System.out.println("Is 10 even? " + isEven.test(10)); // true
        System.out.println("Is 11 even? " + isEven.test(11)); // false
    }
}