package praticeTwo.lamda.methodreference;

import java.util.function.BiFunction;

interface Sayable{

    void say();
}

interface SayableNothing{
    void sayNothing();
}

public class MethodReference {
    public static void say(){
        System.out.println("jai balayya");
    }
    public static void threadStatus(){
        System.out.println("thread is running");
    }

    public static int add(int a, int b){
        return a+b;
    }
    public void sayNothing(){
        System.out.println("Nothing to say");
    }

    public static void main(String[] args) {
        //static Method Reference
        Sayable s1=MethodReference::say;
        s1.say();
        Thread t1=new Thread(MethodReference::threadStatus);
        t1.run();

        BiFunction<Integer,Integer,Integer>add=MethodReference::add;
        System.out.println(add.apply(10,20));



        //instance Method Reference
        MethodReference m1=new MethodReference();
        SayableNothing s2=m1::sayNothing;
        s2.sayNothing();


    }
}
