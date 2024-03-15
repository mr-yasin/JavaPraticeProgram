package oops.instance;



public class InstanceClass {
    public String name;
    public int salary;

    public InstanceClass(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    void call() {
        System.out.println("calling....");

    }

    public static void main(String[] args){
        InstanceClass obj= new InstanceClass("yasin",1000);
        System.out.println(obj.name);


    }

}
