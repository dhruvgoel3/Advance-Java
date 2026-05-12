package StreamAPI;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiBasics {
    public static void main(String[] args) {

        // Create a list and filter all even numbers
        List<Integer> list1 = List.of(2, 4, 50, 21, 22, 67); // List Developed

        // Using Stream , Find all even numbers and add in new List

        Stream<Integer> stream = list1.stream();
        List<Integer> list = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(list); // It will print all the even numbers

        // More small code of above example
        List<Integer> newList = list1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());

        // Using Stream , Find all numbers greater than 10 and add in new List

        List<Integer> listGreaterThanTen = list1.stream().filter(i -> i > 10).collect(Collectors.toList());
        System.out.println(listGreaterThanTen);


    }
}
