package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JoinUsingForeach {
    public static void main(String[] args) {
        List<String> fruit = Arrays.asList("apple","banana","mange");
        StringBuilder result = new StringBuilder();
        fruit.forEach(fruits->{
            if (result.length()>0){
                result.insert(0," ,");
            }

result.insert(0,fruit);
        });
        System.out.println(result.toString());
    }
}
