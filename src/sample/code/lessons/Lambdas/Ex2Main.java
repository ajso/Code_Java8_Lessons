package sample.code.lessons.Lambdas;
/*

Lambda Expression - is an expression through which we can represent an anonymous function
                  - Can only be applied to functional interfaces.(an interface with only one abstract method.)
 */
public class Ex2Main {

    public static void main(String[] args) {

        Ex2 fn = ()->System.out.println("lambda example");
        fn.m1();
    }
}
