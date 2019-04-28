package Homework20;

import java.util.Arrays;
import java.util.*;

import static java.util.stream.Collectors.toList;

public class Runner {

    public static void main(String[] args) {
        List<String> zoo = Arrays.asList("Dog", "Cat", "Bird", "Monkey", "Donkey");

        List<Integer> eachWordLength = zoo.stream()
                .map(s -> s.length())
                .collect(toList());
        System.out.println("Length of Each String = " + eachWordLength + "\n");


        List<Character> flattendedList = zoo.stream()
                .flatMap(x -> x.chars().mapToObj(y -> (char) y))
                .collect(toList());
        System.out.println("Flattended Lists = " + flattendedList);

//        String mergedString = zoo.stream().filter(string -> !string.isEmpty())
//                .collect(Collectors.joining(""));
//        System.out.println("Merged String: " + mergedString + "\n");


        List<String> dWords = zoo.stream()
                .filter(s -> s.startsWith("D"))
                .collect(toList());
        System.out.println("\n" + "Strings that start with the Letter D: " + dWords);

        zoo.stream().filter((s) -> s.startsWith("D"))
                .forEach(System.out::println);


        int length = zoo.stream()
                .mapToInt(s -> s.length())
                .sum();
        System.out.printf("%nTotal Length = %s%n", length);

        int totalLength = zoo.stream()
                .map(String::length)
                .reduce(0, (x1, x2) -> x1 + x2);
        System.out.println("Total Length using Reduce = " + totalLength);


    }

}

