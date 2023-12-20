package org.example;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<Integer> ints = IntStream.range(0,100).boxed().collect(Collectors.toList());
        System.out.printf("Alle Zahlen die durch %s teilbar sind\n", 2);
        filterNumbers(ints, 2).forEach(System.out::println);
        System.out.printf("Alle Zahlen die durch %s teilbar sind\n", 3);
        filterNumbers(ints, 3).forEach(System.out::println);
        System.out.printf("Alle Zahlen die durch %s teilbar sind\n", 5);
        filterNumbers(ints, 5).forEach(System.out::println);
    }

    private static List<Integer> filterNumbers(List<Integer> ints, int number){
        return ints.stream().filter(i -> i % number == 0).collect(Collectors.toList());
    }
}
