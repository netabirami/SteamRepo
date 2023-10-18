package org.example;
import java.util.Arrays;
import java.util.List;

public class ChangeToUppercase {
        public static void main(String[] args) {

            List<String> words = Arrays.asList("hello", "world", "streams", "java");





            List<String> transformedList = words.stream()
                    .map(String::toUpperCase)
                    .toList();

            System.out.println("Transformed list: " + transformedList);
            System.out.println("###############");

            int characterCount = transformedList.stream()
                    .mapToInt(word -> word.replaceAll(" ", "").length())
                    .sum();

            System.out.println("Total character count (excluding spaces): " + characterCount);
        }
    }


