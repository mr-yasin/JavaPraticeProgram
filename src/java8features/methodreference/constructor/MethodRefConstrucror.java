package java8features.methodreference.constructor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

public class MethodRefConstrucror {
    public static void main(String[] args){

    //ref to a constructor
        List<String>fruits=new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("watermelon");
        fruits.add("pinappale");
        //lamda experssiom
        Function<List<String>, Set<String>>setFunction=(fruit)->new HashSet<>(fruit);
        System.out.println(setFunction.apply(fruits));
        //using method ref
        Function<List<String>, Set<String>>setFunction2= HashSet::new;
        System.out.println(setFunction2.apply(fruits));



    }
}

