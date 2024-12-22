package org.darklordsl.first.clas.functions;

import org.darklordsl.first.clas.functions.bifunctionandbeyond.NoArgFunction;

public class FunctionsAsData {

    protected static class Person {
        private String name;
        private Integer age;

        public Person(String name, Integer age) {
            this.name = name;
            this.age = age;
        }
    }

    // DataLoader class definition
    protected static class DataLoader {
        // Private methods for loading real and fake data
        private Person LoadPersonReal() {
            System.out.println("Loading person");
            return new Person("Real Person", 30); // Example real person data
        }

        private Person LoadPersonFake() {
            System.out.println("Returning fake person object");
            return new Person("Fake Person", 25); // Example fake person data
        }

        // Public final member variable to choose the method
        public final NoArgFunction<Person> loadPerson; //NoArgFunction is abcustom functional interface

        // Constructor to set the function based on the environment
        public DataLoader(boolean isDevelopment) {
            this.loadPerson = isDevelopment ? this::LoadPersonFake : this::LoadPersonReal;
        }

    }

    //Main method to demonstrate the usage
    public static void main(String[] args) {
        final boolean isDevelopment = false; // Change to false for production
        DataLoader dataLoader = new DataLoader(isDevelopment);
        System.out.println(dataLoader.loadPerson.apply());
    }


}
