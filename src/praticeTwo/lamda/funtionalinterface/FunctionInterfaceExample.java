package praticeTwo.lamda.funtionalinterface;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
public class FunctionInterfaceExample {
    static Integer addList(List<Integer> list){
        return list.stream()
                .max(Comparator.comparing(i -> Integer.valueOf(i)))
                .get();
    }
    static String show(String message){  
        return "Hello "+message;  
    }  
    public static void main(String[] args) {  
        // Function interface referring to a method  
        Function<String, String> fun = FunctionInterfaceExample::show;  
        // Calling Function interface method  
        System.out.println(fun.apply("Peter"));

        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        // Referring addList() method
        Function<List<Integer>, Integer> fun2 = FunctionInterfaceExample::addList;
        // Calling Function interface method
        int result = fun2.apply(list);
        System.out.println("Max of list values: "+result);
    }  
}  