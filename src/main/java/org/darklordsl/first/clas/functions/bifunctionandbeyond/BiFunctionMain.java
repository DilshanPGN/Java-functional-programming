package org.darklordsl.first.clas.functions.bifunctionandbeyond;

import java.util.function.BiFunction;

public class BiFunctionMain {

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> add = (x, y) -> x + y;
        System.out.println(add.apply(2, 3));

        TriFunction<Integer, Integer, Integer, Integer> addThree =
                (x, y, z) -> x + y + z;
        System.out.println(addThree.apply(2, 4, 1));

        NoArgFunction<String> sayHello = () -> "Hello!";
        System.out.println(sayHello.apply());

    }
}
