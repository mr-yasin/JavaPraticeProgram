package java8features.funtionalinterface;

interface Shape{
    void draw();
}
public class LamdaExampele {
    public static void main(String[] args){
        Shape square=()->System.out.println("Square");
        square.draw();
    }
}
