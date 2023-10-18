package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumAndAverage {
    public static void main(String[] args) {
        List<Integer>numbers = Arrays.asList(1,2,3,4,5);

        Optional<Integer>sumOperation = numbers.stream()
                .reduce(Integer::sum);
        Optional<Integer> sumOptional = Optional.empty();
        int sum = sumOptional.orElse(0);

        System.out.println(sumOperation);
        double average = numbers.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0);

        System.out.println("Sum of the integers: " + sum);
        System.out.println("Average of the integers: " + average);



    }
}
