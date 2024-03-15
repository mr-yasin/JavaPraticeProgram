package java8features.defaultandstaticinterface;
interface Vehicle{
    String getBrand();
    String speedUp();
    String speedDown();

    default String turnAlaramOn(){
        return "turning vehicle alaram on";
    }

    default String turnAlaramOff(){
        return "turing vehicle Alaram off";
    }
}

class Car implements Vehicle{

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


public class DefaultMethotInterfaceDemo {
    public static void main(String[] args){

        Vehicle vehicle=new Car();
        System.out.println(vehicle.getBrand());
        System.out.println( vehicle.speedUp());
        System.out.println(vehicle.speedDown());

        System.out.println(vehicle.turnAlaramOn());
        System.out.println(vehicle.turnAlaramOff());
    }
}
