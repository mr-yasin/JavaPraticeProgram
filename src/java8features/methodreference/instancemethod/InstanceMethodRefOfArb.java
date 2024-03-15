package java8features.methodreference.instancemethod;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.function.Function;

public class InstanceMethodRefOfArb {
    public static void main(String[] args){
        //reference to an instance method of an arbitrary obj of specific type
       //sometimes we call a method of aargument in lamda exp
        //in that case we can use a method reference to call an instance
        //method of an arbitary object of a specific type
        Function<String,String>stringFunction=(input)->input.toLowerCase();
        System.out.println(stringFunction.apply("HELLO YASIN"));
        ///using method ref
        Function<String,String>stringFunctionTwo= String::toLowerCase;
        System.out.println(stringFunctionTwo.apply("HELLO "));
        String[] arr={"y","a","s","i","n"};
        //method using lamda
        Arrays.sort(arr,(s1,s2)->s1.compareToIgnoreCase(s2));
        //method using methRef
        Arrays.sort(arr, String::compareToIgnoreCase);

    }


}
