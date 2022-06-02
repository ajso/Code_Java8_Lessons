package sample.code.lessons.Generics;

public class Printer<T> { //<T> - is a type paramete, it can be anything.
    //This is a generic class that can print anything i.e integer, strings etc instead of creating separate class files to do the same.

    T thingToPrint;

    public Printer(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print(){
        System.out.println(thingToPrint);
    }
}
