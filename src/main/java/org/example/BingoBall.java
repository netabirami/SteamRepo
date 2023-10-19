package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class BingoBall {
    public static void main(String[] args) {
        Stream<String> bStream = createBStream();
        Stream<String> iStream = createIStream();
        Stream<String> nStream = createNSteam();
        Stream<String> gStream = createGSteam();
        Stream<String> oStream = createOSteam();


        Stream<String> concatenatedStream = Stream.concat(Stream.concat(Stream.concat(Stream.concat(bStream,iStream),nStream),gStream),oStream);
        concatenatedStream.forEach(label -> {
            System.out.println(label);
        });
    }

    private static Stream<String> createOSteam() {
        List<String> lable = new ArrayList<>();
        for (int i = 1; i <= 15; i++) {
            lable.add("O"+i);
        }
        return lable.stream();
    }

    private static Stream<String> createGSteam() {
        List<String>lable = new ArrayList<>();
        for (int i = 15; i <=30 ; i++) {
            lable .add("G"+i);
        }
        return lable.stream();
    }

    private static Stream<String> createNSteam() {
        List<String>lable = new ArrayList<>();
        for (int i = 31; i <=45 ; i++) {
            lable .add("N"+i);

        }
        return  lable.stream();
    }

    private static Stream<String> createIStream() {
        List<String>lable = new ArrayList<>();
        for (int i = 46; i <=60 ; i++) {
            lable.add("I"+i);

        }
        return lable.stream();
    }

    private static Stream<String> createBStream() {
        List<String>lable = new ArrayList<>();
        for (int i = 61; i <=75 ; i++) {
            lable.add("B"+i);

        }
        return lable.stream();
    }
}
