package java8features.methodreference.staticmethod;

import java.util.function.BiFunction;
import java.util.function.Function;

public class MethodReference {
    public static int addition(int a,int b){
        return (a+b);
    }
    public static void main(String[] args){
        //1.Method reference to static method
        //lamda expession
        Function<Integer,Double>function=(input)->Math.sqrt(input);
        System.out.println(function.apply(4));

        //using method reference
        Function<Integer,Double>functionMethodRef=Math::sqrt;
        System.out.println(functionMethodRef.apply(4));

        BiFunction<Integer,Integer,Integer>biFuctionLamda=(a,b)->MethodReference.addition(a,b);
        System.out.println(biFuctionLamda.apply(1,2));
        //using methd reference
        BiFunction<Integer,Integer,Integer>biFuctionMethod=MethodReference::addition;
        System.out.println(biFuctionMethod.apply(1,2));
    }

}
