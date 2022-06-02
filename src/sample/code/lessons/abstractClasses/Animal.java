package sample.code.lessons.abstractClasses;
//Why an Abstract Class:- Enforces and organizes exactly what every subClass can implement.
public abstract class Animal {

    //In this example. This class says, for every type of animal created must have a name, age and it has to makeNoise.
    int age;
    String name = "Panny";

    //Note: we can make subclasses of an abstract class that can be instantiated. e.g Cat class

    //Astract Method: doesn't need to specify a body.
    public abstract void makeNoise();


    //Note: All methods in the abstract class don't have to be abstract.

    public void printName(){ //This class will be available to every subClass.
        System.out.println("This is my "+name);
    }

    //Qn. What is the difference btn an abstract class and an Interface.
    //1. You can implement as many interfaces as possible, while we can extend only one abstract class.
    //2. Every declaration/field in the interface is static and final, unlike in the abstract class.

}
