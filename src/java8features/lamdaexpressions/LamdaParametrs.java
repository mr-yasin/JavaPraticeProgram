package java8features.lamdaexpressions;

interface Addable{
    int add(int a,int b);
}
interface Addable2{
    int add(int a, int b,int c);
}
public class LamdaParametrs{

    public static void main(String[] args){


        Addable sum=( a, b)->( a + b);
        int result=sum.add(10,20);

        System.out.println(result);

        Addable2 sum2=(a,b,c)->{
            int d=a+b+c;
            return d;

        };
        int result2= sum2.add(1,2,3);
        System.out.println(result2);

    }


}
