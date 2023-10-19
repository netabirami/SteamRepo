package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Binog {
    public static void main(String[] args) {
        List<String>bList = Arrays.asList("B1","B2","B3","B4","B5");
        List<String>iList = Arrays.asList("I1","I2","I3","I4","I5");
        List<String>nList =Arrays.asList("N1","N2","N3","N4","N5");
        List<String>GList= Arrays.asList("G1","G2","G3","G4","G5");
        List<String>oList= Arrays.asList("G1","G2","G3","G4","G5");


        Stream<String> bStream = bList.stream();
        Stream<String> iStream = iList.stream();
        Stream<String> nStream = nList.stream();
        Stream<String> gStream = GList.stream();
        Stream<String> oStream = oList.stream();
        Stream<String> modifiedBStream = bStream.map(label -> "B" + label.substring(1));
        Stream<String> modifiedIStream = iStream.map(label -> "I" + label.substring(1));
        Stream<String> modifiedNStream = nStream.map(label -> "N" + label.substring(1));
        Stream<String> modifiedGStream = gStream.map(label -> "G" + label.substring(1));
        Stream<String> modifiedOStream = oStream.map(label -> "O" + label.substring(1));
        Stream<String> concatenatedStream = Stream.concat(Stream.concat(Stream.concat(Stream.concat(modifiedBStream, modifiedIStream), modifiedNStream), modifiedGStream), modifiedOStream);

        concatenatedStream.forEach(label -> System.out.println(label));

    }
}
