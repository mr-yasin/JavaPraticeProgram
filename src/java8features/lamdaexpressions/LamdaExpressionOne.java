package java8features.lamdaexpressions;


interface Shape{
    void draw();

}
public class LamdaExpressionOne  {

/* lamda expresioon is an anonoymous funtion ,its a funtion without
*    name and does not belongs to any class
* the main use of lamda funtion is to implements funtional interfaces */
    //funtional interface its can have any number of satic or default methods but has-one abstract method .
    public static void main(String[] args){

        Shape rectangle=()-> System.out.println("This is rectangle");
        print(rectangle);
        //rectangle.draw();
        Shape circle=()-> System.out.println("This is circle");
        print(circle);
        //circle.draw();

        print(()-> System.out.println("This is Squre"));//passing lamda as parameter

    }

    private static void print(Shape shape){
        shape.draw();
    }


}
