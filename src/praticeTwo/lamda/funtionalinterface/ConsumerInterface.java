package praticeTwo.lamda.funtionalinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterface {
    public static void getname(String name){
        System.out.println(name);
    }

    static void addList(List<Integer> list){
        // Return sum of list values
        int result = list.stream()
                .mapToInt(integer -> integer.intValue())
                .sum();
        System.out.println("Sum of list values: "+result);
    }
    public static void main(String[] args) {

       /* It is a functional interface defined in java.util.function package.
        It contains an abstract accept() and a default andThen() method. It can be
        used as the assignment target for a lambda expression or method reference.*/

        Consumer<String>name=ConsumerInterface::getname;
        name.accept("yasin");

        Consumer<Integer>age= System.out::println;
        age.accept(26);


        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        // Referring method to String type Consumer interface
        Consumer<List<Integer>> consumer = ConsumerInterface::addList;
        consumer.accept(list);  // Calling Consumer method

    }
}
