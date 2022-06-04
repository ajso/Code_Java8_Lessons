package sample.code.lessons.Consumer;

import java.util.Arrays;
import java.util.List;


public class Consumer {

//    @Override
//    public void accept(integer integer) {
//
//        System.out.println("Printing: " + integer);
//
//    }
//    Or Using lambda expression, directly access leverage the consumer abstract method.

public static void main(String[] args) {
//    Consumer tPublisher = (t) -> System.out.println("Printing: " + t);
//    Can also be written as:
//    Consumer tPublisher = t->System.out.println("Printing: " +t);
//    tPublisher.accept(12); //only accepts argument

//    forEach always accepts consumer interfaces.
//    Example 2: implementing consumer interface usage.
    List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7);
//    list1.stream().forEach(tPublisher); //this will print the list up to 12 times
//    Or
    list1.forEach(t->System.out.println("Printing: "+ t)); //this will print the same thing.

}

}
