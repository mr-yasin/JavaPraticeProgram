package java8features.funtionalinterface.supplierdemo;

import java.time.LocalDateTime;
import java.util.function.Supplier;

class SupplierImp implements Supplier<LocalDateTime>{

    @Override
    public LocalDateTime get() {
        return LocalDateTime.now();
    }
}

public class SupplierDemo {
    public static void main(String[] args){
        /*Supplier<LocalDateTime> localdatetime=new SupplierImp();
        System.out.println(localdatetime.get());*/

        Supplier<LocalDateTime> localdatetime=()->LocalDateTime.now();
        System.out.println(localdatetime.get());

    }
}
