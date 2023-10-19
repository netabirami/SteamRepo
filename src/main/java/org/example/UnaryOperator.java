package org.example;

public class UnaryOperator {
    public static void main(String[] args) {
            // Define a UnaryOperator that converts a string to uppercase
            java.util.function.UnaryOperator<String> toUpperCase = str -> str.toUpperCase();

            String input = "my name is";
            String result = toUpperCase.apply(input);

            System.out.println("smallcase: " + input);
            System.out.println("Uppercase: " + result);
        }
    }


