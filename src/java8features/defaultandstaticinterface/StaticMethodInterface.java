package java8features.defaultandstaticinterface;
interface Vehicle2{
    String getBrand();
    String speedUp();
    String speedDown();

    static String turnAlaramOn(){
        return "turning vehicle alaram on";
    }

    static String turnAlaramOff(){
        return "turing vehicle Alaram off";
    }
}

class Car2 implements Vehicle{

    @Override
    public String getBrand() {
        return "BMW";
    }

    @Override
    public String speedUp() {
        return "Speed Up";
    }

    @Override
    public String speedDown() {
        return "Slow Down";
    }
}


public class StaticMethodInterface {
    public static void main(String[] args) {

        System.out.println(Vehicle2.turnAlaramOff());
        System.out.println(Vehicle2.turnAlaramOn());

    }
}
