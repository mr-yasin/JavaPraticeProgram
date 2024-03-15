package java8features.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;



public class SortingList {
    public static void main(String[] args) {
        List<String>fruits=new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Watermelon");
        fruits.add("PineApple");
        fruits.add("Gova");
        List<String>sortedFruits=fruits.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println(sortedFruits);
        System.out.println("***************");
        List<String>sortedFruits2=fruits.stream().sorted((s1,s2)->s1.compareTo(s2)).collect(Collectors.toList());
        System.out.println(sortedFruits2);

        System.out.println("***************");
        List<String>sortedFruits3=fruits.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedFruits3);
        //decending order
        List<String>sortedFruits4=fruits.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedFruits4);
        System.out.println("***************");
        List<String>sortedFruits5=fruits.stream().sorted((s1,s2)->s2.compareTo(s1)).collect(Collectors.toList());
        System.out.println(sortedFruits5);


    }
}
