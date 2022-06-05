package sample.code.lessons.LoopsAndStmts;
/*
Fibonacci number is obtained when the first number is added to the next number.

 */
public class FibonacciMain {

    public static void main(String[] args) {
        int n=0;
        int n1=1;
        int n3;
        int count = 20;
        for(int i=0; i<=count;i++){

            n3=n+n1; //to get n3 add n+n1;
            n=n1; //n becomes n1
            n1=n3; // n1 becomes n3 and repeat 20 times.

            System.out.print(n3 +" ,");
        }

    }
}
