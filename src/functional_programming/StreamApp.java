package functional_programming;

import java.math.BigInteger;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamApp {
    public static void main(String[] args) {
        //print 0 to 99
//        IntStream.range(0, 100).forEach(i -> System.out.println(i));

        //print 0 to 100
//        IntStream.rangeClosed(0, 100).forEach(i -> System.out.println(i));

        //print 0 to MAX of int
//        IntStream.iterate(0, i -> i+1).forEach(i -> System.out.println(i));

        //print 0 to infinity
//        Stream.iterate(BigInteger.ONE, i -> i.add(BigInteger.ONE))
//                .forEach(i -> System.out.println(i));


        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
        System.out.println(integerStream.count());

        OptionalInt first = IntStream
                .rangeClosed(0, 10)             //0 부터 10 까지 숫자 중에서
                .filter(i -> i > 3 && i < 9)    //3~9 사이의 숫자를 골라
                .map(i -> i * 2)                //2배를 하고
                .filter(i -> i > 10)            //그 결과가 10 보다 큰 숫자 중에서
                .findFirst();                   //첫 번째 숫자를 찾는다

        System.out.println(first.orElse(0));    //12
    }
}