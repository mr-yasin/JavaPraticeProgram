package praticeTwo.lamda.lamda;

import java.util.ArrayList;
import java.util.List;

interface Shape{
    void draw();
}
interface ShapeTwo{
    String draw();
}
interface Name{
    void getName(String name);

}

interface NameTwo{
    String getName(String name);

}
interface Add{
    int add(int a,int b);
}
interface AddTwo{
    void add(int a,int b);
}
public class LamdoDemo {
    public static void main(String[] args) {
        Shape draw=()-> System.out.println("rectangle");
        draw.draw();

        ShapeTwo shapeTwo=()->("square");
        System.out.println(shapeTwo.draw());

        Name name=(myName)->System.out.println("your name is :"+ " "+myName);
        name.getName("yasin");

        NameTwo nameTwo=(nametwo)->(nametwo);
        System.out.println("Your name is"+nameTwo.getName("yasinTwo"));

        Add add=(a,b)->(a+b);
        System.out.println(add.add(10, 20));

        AddTwo addTwo=(a,b)-> System.out.println(a+b);
        addTwo.add(5,6);

        List<String> list=new ArrayList<String>();
        list.add("ankit");
        list.add("mayank");
        list.add("irfan");
        list.add("jai");
        /*list.forEach(
                (n)->System.out.println(n)
        );*/
        list.stream().forEach((n)-> System.out.println(n));

        Runnable r1=new Runnable() {
            @Override
            public void run() {
                System.out.println("t1 is running");
            }
        };
        Thread t1=new Thread(r1);
        t1.start();

       /* Runnable r2=()-> System.out.println("t2 is running");*/
        Thread t2=new Thread(()-> System.out.println("t2 is running"));
        t2.start();





    }
}
