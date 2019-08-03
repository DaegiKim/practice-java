package java8.stream;

import java.util.Arrays;

public class MapReduceApp {
    public static void main(String[] args) {
        String s = "hello world. these are lower cases.";

        String reduce = Arrays
                .stream(s.split(""))
                .map(String::toUpperCase)
                .reduce("", (a, b) -> a + b);

        System.out.println(reduce);
    }
}
