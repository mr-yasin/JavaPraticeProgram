package java8features.streams.pratice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstFindAnyMethodDemo {
    public static void main(String[] args) {

        List<Integer>list= Arrays.asList(1,2,3,4,5);

        Optional<Integer>element=list.stream()
                .findFirst();
        if(element.isPresent()){
            System.out.println(element.get());
        }else {
            System.out.println("Element is not present");
        }

        Optional<Integer>element2=list.stream().findAny();
        if(element2.isPresent()){
            System.out.println(element2.get());

        }else {
            System.out.println("element is not present");
        }
    }
}
