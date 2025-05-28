//Takes input parameter and returns an output to the user
// This code demonstrates the use of a Function interface in Java to compute the square of a number.
// It uses a lambda expression to define the function and applies it to the input value.
// The code reads an integer from the user, computes its square, and prints the result.

import java.util.function.Function;
import java.util.Scanner;
public class FunctionCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = scanner.nextInt();
        // Define a function that takes an integer and returns its square
        Function<Integer, Integer> squareOfNum = (v) -> v * v;
        Integer output = squareOfNum.apply(input);
        // Print the output
        System.out.println("The square of " + input + " is: " + output);
    }
}