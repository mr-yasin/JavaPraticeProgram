package java8features.lamdaexpressions;
class THreadDemo implements Runnable{

    @Override
    public void run() {
        System.out.println("run method is called");

    }
}
public class RunnableExample {
    public static void main(String[] args){
        Thread thread =new Thread(new THreadDemo());
        thread.start();

       /* Runnable runnable=()->System.out.println("run method using lamda");
        Thread threadlamda=new Thread(runnable);*/
        Thread threadlamda=new Thread( ()->System.out.println("run method using lamda"));
        threadlamda.start();

    }

}
