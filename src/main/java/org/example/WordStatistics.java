package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class WordStatistics {
        public static void main(String[] args) {
            List<String> words = Arrays.asList("cat", "elephant", "dog", "dolphin");

            long countWordsWithMoreThan3Chars = words.stream()
                    .filter(word -> word.length() > 3)
                    .count();

            System.out.println("Count of words with more than 3 characters: " + countWordsWithMoreThan3Chars);

            Optional<String> shortestWord = words.stream()
                    .min((word1, word2) -> Integer.compare(word1.length(), word2.length()));

            if (shortestWord.isPresent()) {
                System.out.println("Shortest word: " + shortestWord.get());
            } else {
                System.out.println("No words in the list.");
            }
        }
    }


