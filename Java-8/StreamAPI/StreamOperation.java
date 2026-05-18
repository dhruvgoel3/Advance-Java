package StreamAPI;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperation {
    public static void main(String[] args) {
        List<Integer> list = List.of(2, 33, 4, 7, 4, 88, 5, 3, 6, 5, 8);
        // Displaying this list
        Stream<Integer> stream = list.stream();
        stream.forEach(e -> {
                    System.out.print(e + " ");
                }
        );

        // Filter Function
        List<String> names = List.of("Aman", "Dhruv", "Raghav", "Durgesh");
        List<String> newName = names.stream().filter(e -> e.startsWith("A")).collect(Collectors.toList());
        System.out.println(newName);

        // Map Function
       List<Integer> newNumbers =  list.stream().map(i -> i * i).collect(Collectors.toList());
        System.out.print(newNumbers + " ");


    }
}
