package java8features.funtionalinterface;

/*Interface that contains one abstract method is
* know as functional interface*/

@FunctionalInterface
public interface  MyFunctionalInterface {
    void print(String msg);
    default void m1(){
        System.out.println("default method");
    }
    static void m2(){
        System.out.println("Static method");
    }
}

