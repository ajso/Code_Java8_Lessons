package sample.code.lessons.abstractClasses;
//An abstract class is a class that we can't instantiate. we can't create objects from abstract classes.

//
public class AbstractClassMain {

    public static void main(String[] args) {
//        Cat myCat = new Cat(); Because it is an abstract class it can not be instatiated directly

        //now after creating a sub class
        Cat myCat = new Cat();
        myCat.makeNoise();
        //accessible to subClasses
        myCat.printName();

    }
}
