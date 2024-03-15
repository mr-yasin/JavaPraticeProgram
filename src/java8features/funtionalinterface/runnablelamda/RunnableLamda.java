package java8features.funtionalinterface.runnablelamda;

class RunnableImp implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread is running");
    }
}
public class RunnableLamda {

    public static void main(String[] args){
        /*Runnable runnable=new RunnableImp();
        runnable.run();*/



        Runnable runnable=()-> {
            System.out.println("Thread is running");
        };

        runnable.run();

    }
}
