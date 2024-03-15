package java8features.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;



class Employee{
    private int id;
    private String name;
    private int age;
    private long salary;

    public Employee(int id, String name, int age, long salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
public class SortEmpDemo {
    public static void main(String[] args) {
        List<Employee>emp=new ArrayList<>();
        emp.add(new Employee(1,"yasin",32,27000L));
        emp.add(new Employee(2,"ayyappa",23,28000L));
        emp.add(new Employee(3,"ramSai",24,21000L));
        emp.add(new Employee(4,"vamsi",25,20000L));
        emp.add(new Employee(5,"mohan",26,28000L));
        emp.add(new Employee(6,"bhaskar",27,30000L));

        List<Employee>sortedEmp=emp.stream().sorted(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o1.getSalary()-o2.getSalary());
            }
        }).collect(Collectors.toList());
        System.out.println(sortedEmp);



        System.out.println("******");

        List<Employee>sortedEmp1=emp.stream()
                .sorted((Employee o1, Employee o2)->(int) (o2.getSalary()-o1.getSalary()))
                .collect(Collectors.toList());
        System.out.println(sortedEmp1);

        System.out.println("*************");

        List<Employee>sortedEmp3=emp.stream()
                .sorted(Comparator.comparingLong(Employee::getSalary))
                .collect(Collectors.toList());
        System.out.println(sortedEmp3);

        List<Employee>sortedEmp4=emp.stream()
                .sorted(Comparator.comparingLong(Employee::getSalary).reversed())
                .collect(Collectors.toList());
        System.out.println(sortedEmp4);




    }
}
