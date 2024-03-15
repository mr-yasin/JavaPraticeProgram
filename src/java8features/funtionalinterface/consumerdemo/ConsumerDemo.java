package java8features.funtionalinterface.consumerdemo;

import java.util.function.Consumer;

class ConsumerImp implements Consumer<String> {


    @Override
    public void accept(String s) {
        System.out.println(s);

    }
}

    public class ConsumerDemo  {

    public static void main(String[] args){

        /*Consumer<String> consumer=new ConsumerImp();
        consumer.accept("Hello yasin");*/

        Consumer<String> consumer=(s)->System.out.println(s);
        consumer.accept("yasin");





        };

    }



