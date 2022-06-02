package sample.code.lessons.Arrays;
//Understand the basics and tricks.
//
public class ParternsMain {
    public static void main(String[] args) {

        int n=5;
        //Printing a square.
        System.out.println("=============A Square===============");
        for (int i =0; i<n; i++){
            for (int j=0; j<n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //Printing a square.
        System.out.println("=============Increasing Triangle===============");
        for (int i =0; i<n; i++){
            for (int j=0; j<i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //Printing a square.
        System.out.println("=============Decreasing Triangle===============");
        for (int i =0; i<n; i++){
            for (int j=i; j<n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
