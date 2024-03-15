package typecasting;

public class TypeCasting {
    public static void main(String[] args) {
        int a=10;
        float b=(float)a;
        System.out.println(b);//wideing

        float c= (float) 20.0f;
        int d=(int)c;
        System.out.println(d);

        System.out.println(Integer.toString(d));
        String stg1="10";
        System.out.println(Integer.parseInt(stg1));


    }
}
