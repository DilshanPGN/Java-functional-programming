package org.darklordsl.first.clas.functions;

import org.darklordsl.first.clas.functions.bifunctionandbeyond.NoArgFunction;

public class ClosureExample {
    public static void main(String[] args) {
        // Define a function that returns another function
        NoArgFunction<NoArgFunction<String>> createGreeter = () -> {
            String name = "Shawn"; // Variable in the parent scope
            return () -> "Hello, " + name; // Returned function using the parent scope variable
        };

            // Create a greeter function using the createGreeter function
            NoArgFunction<String> greeter = createGreeter.apply();

            // Call the greeter function and print the result
            System.out.println(greeter.apply()); // Output: Hello, Shawn
        }

}