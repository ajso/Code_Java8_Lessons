package sample.code.lessons.ConsumerInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

/*
Here method don't have any arguments but expects a return type.
implements Supplier<String> - removed in order to use lambda

 */
public class SupplierDemo {

    public static void main(String[] args) {
// Using a traditional way of java. // Using a traditional way to return results.
//        Supplier<String> supplier = new SupplierDemo();
//        System.out.println(supplier.get());

//Using the lambda Expression way to get results. First remove the implements key word.
        Supplier<String> supplier = ()-> { //has no argument becoz it's a supplier.
            return "Helle Andrew";
        };
//        System.out.println(supplier.get()); //get method only get the return type and doesn't take any argument


//Example 2. With a list of data. using the stream Api.
        List<String> list1 = Arrays.asList(); // "1","2","3","4","5","6","7" - if this list is empty it will return the supplier.
        // using stream to find any string, if doesn't exist return the supplier
        String s = list1.stream().findAny().orElseGet(supplier);
        System.out.println(s);

    }

//    @Override
//    public String get() {
//        return "Hi Andrew";
//    }

}
