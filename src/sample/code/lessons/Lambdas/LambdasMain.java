package sample.code.lessons.Lambdas;
//Note: Lambdas in java can be used along with certain type of interfaces.
//Interfaces - Holds the method that are implemented by a class.
//Note: -Lambdas can only be used in cases of a functional interface(i.e - Interface with an Abstract Method).
//      -A lambda is a shot cut to implementing an abstract method in a functional interface.
public class LambdasMain {

    public static void main(String[] args) {
        //creating a cat Object
        //Cat myCat = new Cat();
        //myCat.print(); //method-1:print output from the print method.
        //OR
        //printThing(myCat);
//i.e - Using Lambda, We don't even need to create an object of a Cat class.
       printThing((g)->{ //This is similar to passing in a print()
           System.out.println("Meow..!!"+g);
//            return g; //implementation if the print() is a string. add a return statement.
       });

        //OR
        printThing((q)->System.out.println("Meow2..!!"+q)); //if the print() is a void
        //printThing((q)->"Meow2..!!" +q); //implementation if the print() is a string

        //OR - These are all ways to implement a lambda.
        PrintableIn lambdaPrintable = (s)->System.out.println("Meow3..!!!" +s); //if the print() is a void
        //PrintableIn lambdaPrintable = (s)->("Meow3..!!!" +s); //implementation if the print() is a string
        printThing(lambdaPrintable);


        //EXAMPLE WHERE THE print() in the interface TAKES A PARAMETER


    }


    static void printThing(PrintableIn thing){
        //Since Cat class implements PrintableIn and print() is defined in the interface.
        // we can directly access the print method in the Cat class.
        thing.print("???");
    }

    //Now NOTE:, lambda will allow us to directly implement the print() in the Cat Class as a parameter
}
