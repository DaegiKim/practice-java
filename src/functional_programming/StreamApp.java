package functional_programming;

import java.math.BigInteger;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

public class StreamApp {
    public static void main(String[] args) {
        print0To99();
        print0To100();
        print0ToMAXOfInt();
        print0ToInfinity();
        filterAndMapExample();
        collectAndJoiningExample();
    }

    private static void collectAndJoiningExample() {
        String collect = IntStream
                .rangeClosed(0, 10)
                .mapToObj(String::valueOf)
                .collect(joining(" : "));

        System.out.println(collect);
    }

    private static void filterAndMapExample() {
        OptionalInt first = IntStream
                .rangeClosed(0, 10)             //0 부터 10 까지 숫자 중에서
                .filter(i -> i > 3 && i < 9)    //3~9 사이의 숫자를 골라
                .map(i -> i * 2)                //2배를 하고
                .filter(i -> i > 10)            //그 결과가 10 보다 큰 숫자 중에서
                .findFirst();                   //첫 번째 숫자를 찾는다

        System.out.println(first.orElse(0));    //12
    }

    private static void print0ToInfinity() {
        Stream.iterate(BigInteger.ONE, i -> i.add(BigInteger.ONE))
                .forEach(i -> System.out.println(i));
    }

    private static void print0ToMAXOfInt() {
        IntStream.iterate(0, i -> i+1).forEach(i -> System.out.println(i));
    }

    private static void print0To100() {
        IntStream.rangeClosed(0, 100).forEach(i -> System.out.println(i));
    }

    private static void print0To99() {
        IntStream.range(0, 100).forEach(i -> System.out.println(i));
    }
}