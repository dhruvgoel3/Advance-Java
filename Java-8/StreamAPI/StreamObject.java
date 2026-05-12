package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {
        // Stream API = Used to process collections or [group of objects]
        // Now we will learn how can we get an object ofa stream
        // Their are a lot of ways , but here we will discuss the main five(5) ways

        // 1. Blank / empty stream
        Stream<Object> emptyStream = Stream.empty();
        emptyStream.forEach(e -> {
            System.out.println(e);
        });
        // 2. array , object , collection
        String names[] = {"Dhruv", "Raghav", "Devanshu"};
        Stream<String> stream1 = Stream.of(names);
        stream1.forEach(e -> {
            System.out.println(e);
        });

        // 3 Builder
        Stream<Object> streamBuilder = Stream.builder().build();

        //4
        IntStream stream = Arrays.stream(new int[]{2, 4, 65, 3, 5, 6, 4});
        stream.forEach(e -> {
            System.out.println(e);
        });

        //5 using collections - ex- list , set

        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(34);
        list.add(23);
        list.add(78);

        Stream<Integer> stream2 = list.stream();
        stream2.forEach(e -> {
            System.out.println(e);
        });


    }
}
