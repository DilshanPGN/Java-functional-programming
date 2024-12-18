package org.darklordsl.first.clas.functions;

import java.util.function.Function;

public class LambdaExpressions {
    public static void main(String[] args) {
        // Define a function that returns the absolute value of an integer using a lambda expression

        Function<Integer, Integer> absoluteValue = x -> x < 0 ? -x : x;
        //Do not need to add return keyword for single lines. it will automatically return

        // Multi-line lambda expression
        Function<Integer, Integer> absoluteValueMultiLine = x -> {
            if (x < 0) {
                return -x;
            } else {
                return x;
            }
        };

        // Call the function and print the result
        System.out.println(absoluteValue.apply(-10)); // Output: 10
        System.out.println(absoluteValueMultiLine.apply(-10)); // Output: 10
    }

}
