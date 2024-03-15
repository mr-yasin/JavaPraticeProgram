package java8features.optionalclass;

import java.util.Optional;




public class OptionalClassDemo {
    public static void main(String[] args){
        //to avoid null check and nullpointerExceptions
        //acts as container object
        //optional class is final class we cannot extend optional class
        //optional class javadoc
        //of,empty,ofNullable
        String email="yasin@gmail.com";
        String email2=null;

        Optional<Object> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);

        Optional<String> email1 = Optional.of(email);
        System.out.println(email1);

        Optional<String>stringOptional=Optional.ofNullable(email2);
        System.out.println(stringOptional);


        Optional<String>stringOptional2=Optional.ofNullable(email);
        if(stringOptional2.isPresent()){
            System.out.println(stringOptional2.get());

        }

        //orelse
        //String name="yasin";
        String name=null;
        Optional<String>name1=Optional.ofNullable(name);
        String finalName = name1.orElse(("enter your name"));
        System.out.println(finalName);
        String orElsegetmethod = name1.orElseGet(() -> "name");
        System.out.println(orElsegetmethod);

        //or else thorw method
       // String empName="yaisn";
       /* String empName=null;
        Optional<String>empopt=Optional.ofNullable(empName);
        String empNotExit = empopt.orElseThrow(() -> new IllegalArgumentException("Emp not exit"));
        System.out.println(empNotExit)*/;

        //is present
        Optional<String>gender=Optional.of("Male");
        Optional<String>gendetOpt=Optional.empty();

        gender.ifPresent((s)-> System.out.println("Value is presret"));
        //if doest print get into if present method
        gendetOpt.ifPresent((s)->System.out.println("No value is presnet"));

        //filter method
        String result="abcd";
        if(result !=null && result.contains("abcd")){
            System.out.println(result);
        }

        Optional<String>optString=Optional.of(result);
        optString.filter(res->res.contains("abcd"))
                .map(String::trim)
                .ifPresent(System.out::println);


    }
}
