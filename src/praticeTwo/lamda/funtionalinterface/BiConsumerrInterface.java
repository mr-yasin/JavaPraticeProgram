package praticeTwo.lamda.funtionalinterface;


import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

class BiCosumerInterfacetwo{
    public static void showStudentdetails(Map<Integer,String> map,String mapName){
        System.out.println("----------"+mapName+" records-----------");
        map.forEach((key, val)->System.out.println(key+" "+val));

    }

}

class BiConsumerInterface {
    public static void showDetails(String name,int age){
        System.out.println(name+" : "+age);
    }

    public static void main(String[] args) {


       /* BiConsumer Interface accepts two input arguments and does not return any result.
                This is the two-arity specialization of Consumer interface.
        It provides a functional method accept(Object, Object) to perform custom operations.*/
        //using MethodReference
        BiConsumer<String,Integer>details= BiConsumerInterface::showDetails;
        details.accept("yasin",25);
        //using lamda
        BiConsumer<String,Integer>detail=(name,age)-> System.out.println(name+" : "+age);
        detail.accept("yasin",25);
        System.out.println("//////////////////////////////////////////////////");

        Map<Integer, String> map = new HashMap<Integer,String>();
        map.put(100, "Mohan");
        map.put(110, "Sujeet");
        map.put(115, "Tom");
        map.put(120, "Danish");
        // Referring method
        BiConsumer<Map<Integer, String>, String> biCon = BiCosumerInterfacetwo::showStudentdetails;
        biCon.accept(map, "Student");



    }
}
