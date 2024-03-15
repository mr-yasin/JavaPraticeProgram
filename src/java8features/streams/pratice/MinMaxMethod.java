package java8features.streams.pratice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class MinMaxMethod {
    public static void main(String[] args) {
        Stream<Integer> list= Stream.of(4,3,2,5,7,8,1,10);
        System.out.println(list.count());

        Integer integer=list.min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(integer);
    }
}
