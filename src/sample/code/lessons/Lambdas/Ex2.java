package sample.code.lessons.Lambdas;

public interface Ex2 {

    void m1(); //abstract method. qualify to write a lambda expression.

    default void m2(){

        System.out.println("Default Other method m2");

    }
    default void m3(){
        System.out.println("Default other method m3");
    }

    default void m4(){
        System.out.println("Default other method m4");
    }
}
