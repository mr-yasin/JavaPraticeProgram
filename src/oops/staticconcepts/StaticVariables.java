package oops.staticconcepts;

public class StaticVariables {
    public static String name1="Yasin";
    public static void getAge(){
        System.out.println("27");
    }

    public static long getNum(long num){
      return num;
    }
    public static void main(String[] args){

       String name= StaticVariables.name1;
       System.out.println(name);
       StaticVariables.getAge();
       long num=9493941846l;
       System.out.println(StaticVariables.getNum(num));

    }
}
