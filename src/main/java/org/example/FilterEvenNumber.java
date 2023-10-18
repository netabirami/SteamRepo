package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNumber {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2, 3, 4, 5,6,7,8,9,10);
        List<Integer>oddNumber= numbers.stream()
                .filter(number->number % 2 != 0)
                .collect(Collectors.toList());
        System.out.println(oddNumber);

        System.out.println("####################");
        int sumOfOddNumber =oddNumber.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sumOfOddNumber);
        System.out.println("###############");
        System.out.println(oddNumber);





    }

}
