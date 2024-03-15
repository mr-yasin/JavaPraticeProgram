package java8features.streams;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        /* stream represent a sequence of objects from
        source,which support aggregate operations*/
    //source->filter->sort->map->collect


        Stream<String> stream=Stream.of("a","b","C","d");
        stream.forEach(System.out::println);

        Collection<String>collection= Arrays.asList("Java","Spring","JEE","Hibernate");
        Stream<String>stream1=collection.stream();
        stream1.forEach(System.out::println);


        List<String> list= Arrays.asList("Java","Spring","JEE","Hibernate");
        Stream<String>stream2=list.stream();
        stream2.forEach(System.out::println);

        Set<String> set=new HashSet<>(list);
        Stream<String>stream3=list.stream();
        stream3.forEach(System.out::println);


        String[] arr={"A","B","C","D"};
        Stream<String>stream4= Arrays.stream(arr);
        stream4.forEach(System.out::println);

    }
}
