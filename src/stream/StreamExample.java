package stream;

import java.util.*;
import java.util.stream.Collectors;

public class StreamExample {
    public static void test(){
        List<Product> productsList = new ArrayList<>();
        //Adding Products
        productsList.add(new Product(1,"HP Laptop",25000f));

        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenevo Laptop",28000f));
        productsList.add(new Product(4,"Sony Laptop",28000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));
        productsList.add(new Product(6,"Azus Laptop",32000f));

        // print laptop prices less than 30000
        productsList.stream()
                .filter(x -> x.price < 30000)
                .map(p -> p.price)
                .forEach(
                        System.out::println
                );

        //give 5% discount if price larger than 30000 and print
        productsList.stream()
                .filter(x -> x.price > 30000)
                .map(p -> {
                    p.price = p.price*.95f;
                    return p.name;
                })
                .forEach(
                        System.out::println
                );

        List<Integer> integerList = new ArrayList<>();
        Collections.addAll(integerList,1,2,3,4,5);
        integerList.stream().filter(x ->x%2==1).forEach(System.out::println);

        System.out.println("------------------");
        List<String> fruits = new ArrayList<>();
        Collections.addAll(fruits,"apple", "banana", "cherry");
        fruits.stream().map(String::toUpperCase).forEach(System.out::println);

        System.out.println("------------------");
        List<Integer> integerList2 = new ArrayList<>();
        Collections.addAll(integerList2,10, 5, 20, 8);

        List<Integer> emptyList = new ArrayList<>();
        System.out.println(emptyList.stream().min(Integer::compareTo).orElseThrow(()-> new NoSuchElementException()));
    }

    public static void example(){
        List<String> nameList = Arrays.asList("Sachith","Malith","Dinesh","Malith");
        nameList.stream().distinct().filter(m-> m.startsWith("S")).map(m-> "Mr : "+m).forEach(System.out::println);
        nameList.stream().distinct().forEach(System.out::println);

    }
}
