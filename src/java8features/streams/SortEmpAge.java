package java8features.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmpAge {
    public static void main(String[] args) {
        List<Employee>employees=new ArrayList<>();
        List<Employee>emp=new ArrayList<>();
        employees.add(new Employee(1,"yasin",32,27000L));
        employees.add(new Employee(2,"ayyappa",23,28000L));
        employees.add(new Employee(3,"ramSai",24,21000L));
        employees.add(new Employee(4,"vamsi",25,20000L));
        employees.add(new Employee(5,"mohan",26,28000L));
        employees.add(new Employee(6,"bhaskar",27,30000L));
        System.out.println(employees);

        List<Employee>sortedAge=employees.stream()
                .sorted((Employee s1,Employee s2)->(int)(s1.getAge()-s2.getAge()))
                .collect(Collectors.toList());
        System.out.println(sortedAge);
        System.out.println("**********");
        List<Employee>sortedAge2=employees.stream()
                .sorted(Comparator.comparingInt(Employee::getAge))
                .collect(Collectors.toList());
        System.out.println(sortedAge2);
        System.out.println("***********");
        List<Employee>sortedAge3=employees.stream()
                .sorted(Comparator.comparingInt(Employee::getAge).reversed())
                .collect(Collectors.toList());
        System.out.println(sortedAge3);
        //sorted by name
        System.out.println("******************");
        List<Employee>sortedName=employees.stream()
                .sorted(Comparator.comparing(Employee::getName))
                .collect(Collectors.toList());
        System.out.println(sortedName);
        System.out.println("**********");
        List<Employee>sortedName2=employees.stream()
                .sorted(Comparator.comparing(Employee::getName).reversed())
                .collect(Collectors.toList());
        System.out.println(sortedAge3);
    }
}
