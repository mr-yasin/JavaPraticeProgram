package oops.inheritance;
class Car{
    int id;
    String name;

    public Car() {
    }

    public Car(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class Inheritance extends Car  {
    public  long mobileNumber;

    public Inheritance(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Inheritance() {

    }

    public void getdetails(long mobileNumber){
        System.out.println(super.name);
        System.out.println(super.id);
        System.out.println(mobileNumber);
    }

    static public void main(String[] args){
        Car obj1=new Car(1,"yasin");

        Inheritance obj3=new Inheritance();
        obj3.getdetails(9493941846l);


    }


}
