package sample.code.lessons.Arrays;

import java.util.Scanner;

public class TwoDArraysMain {


    public static void main(String[] args) {
        //Two-dimensional arrays | MultiDimensional Arrays
        //Initailizing a two-dimensinal array and allocate memory.
//        String[][] cars = new String[3][3]; //this indicates 4 rows(1st) and 4 columns(2nd).

//        OR

        String[][] cars = {
                {"camero","GMC","Pick Up"},
                {"Lorry","Lamborghini","Pick Up"},
                {"Bus","GMC","Lamborghini"}
        };

        //the outer for loop is incharge of the rows. and the inner for loop is incharge of the colomns.
        for (int i=0; i < cars.length; i++){
            //System.out.println(); //this will move our cursor down to the next row.
            //for loop for the colomns
            for(int j=0; j<cars[i].length; j++){
                 //System.out.println(cars[i][j]+" ");
            }

        }

//=====================================Example2.=============================

        int[][] numberGrid = {
                {1,2,3},
                {4,5,6,},
                {7,8,9},
                {0}
        };
//        System.out.println(numberGrid[0][1]); Accesing elements in the loop.
        for (int i=0; i<numberGrid.length; i++){ //this is responsible for looping through the rows.
            for(int j=0; j<numberGrid[i].length; j++){ //this is responsible of looping through the columns

                System.out.print(numberGrid[i][j]+" "); //prints the results.

            }
            System.out.println();

        }

//================Transpose Matrix===========
        System.out.println("===================TRANSPOSE MATRICS==================");
//        Transpose matrix is formed when all rows are turned into columns. inverse

        Scanner scanner = new Scanner(System.in); //this is to accept user input.
        System.out.println("Enter how many rows you want.");
        int r = scanner.nextInt();
        System.out.println("Enter how many column you want.");
        int c = scanner.nextInt();
        //creating the 2D array.
        int[][] matA = new int[r][c];
        System.out.println("Enter "+ (r*c) + " Values:");

        for (int i=0; i<r;i++){
            for (int j=0; j<c; j++){
                //provided values store in
                matA[i][j] = scanner.nextInt();
            }
        }


        System.out.println("The Original matrix is:- ");
        for (int i=0; i<r;i++){
            for (int j=0; j<c; j++){
                //provided values store in
                System.out.print(matA[i][j] +" ");
            }
            System.out.println();
        }

        System.out.println("The Transposed matrix is:- ");
        for (int i=0; i<c;i++){
            for (int j=0; j<r; j++){
                //provided values store in
                System.out.print(matA[j][i] +" ");
            }
            System.out.println();
        }






    }

}
