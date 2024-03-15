package java8features.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Product{
    private int id;
    private String name;
    private float price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

public class StreamFilter {
    public static void main(String[] args) {
        List<Product>list=new ArrayList<Product>();
        for(Product product : getProducts()){
            if(product.getPrice()>25000){
                list.add(product);
            }
        }
        for (Product product: list){
            System.out.println(product);

        }
        System.out.println("***********");
        //streamapi
       List<Product>list2= getProducts().stream()
               .filter((product2)->product2.getPrice()>25000f)
               .collect(Collectors.toList());
        list2.forEach(System.out::println);

        System.out.println("*************");
        getProducts().stream()
                .filter((product2)->product2.getPrice()>25000f)
                .forEach(System.out::println);

    }
    private static List<Product>getProducts(){
        List<Product>listOfProducts=new ArrayList<>();
        listOfProducts.add(new Product(1,"Hp",20000.38f));
        listOfProducts.add(new Product(2,"Dell",28000.38f));
        listOfProducts.add(new Product(3,"Samsung",21000.38f));
        listOfProducts.add(new Product(4,"lenovo",26000.38f));
        listOfProducts.add(new Product(5,"Red Mi",220000.38f));
        return listOfProducts;
    }
}
