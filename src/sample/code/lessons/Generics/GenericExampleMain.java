package sample.code.lessons.Generics;

import java.util.ArrayList;

public class GenericExampleMain {
//Generics use the ability to have one flexible class for many(different) data types.
//    Generics don't work with primitive data types.

    public static void main(String[] args){

        //printing an integer
        Printer<Integer> printer = new Printer<>(34);
        printer.print();
        //printing a double with the same class
        Printer<Double> printDouble = new Printer<>(45.9);
        printDouble.print();
        //print a string with the same printer class
        Printer<String> stringPrinter = new Printer<>("We're using the same class to print all these");
        stringPrinter.print();
        //common implementations of generics
//        ArrayList<Cat> cats = new ArrayList<Cat>();
//        cats.add(new Cat());

        shout("John");
        shout(573842);
        shout(5.78);
    }

    //generic method
    private static <T> void shout(T thingToShout){

        System.out.println(thingToShout + "!!!!");

    }

}
