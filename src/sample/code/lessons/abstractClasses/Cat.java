package sample.code.lessons.abstractClasses;

public class Cat extends Animal{

    //makeNoise is the implemented here.
    @Override
    public void makeNoise() {
        System.out.println("Hiss");
    }
}
