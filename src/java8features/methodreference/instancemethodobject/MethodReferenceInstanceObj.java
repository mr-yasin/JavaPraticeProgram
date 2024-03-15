package java8features.methodreference.instancemethodobject;

import java8features.methodreference.staticmethod.MethodReference;

@FunctionalInterface
interface Printable{
    void Print(String msg);


}

public class MethodReferenceInstanceObj {
    public void display(String msg){
        msg=msg.toUpperCase();
        System.out.println(msg);
    }
    public static void main(String[] args){
       //method reference to an instance method of a particular obj
        MethodReferenceInstanceObj methoRef=new MethodReferenceInstanceObj();
        //lamda expression
        Printable print=(msg)->methoRef.display(msg);
        print.Print("hello world");

        //methodRef
        Printable printTwo= methoRef::display;
        printTwo.Print("hello world2");


    }
}
