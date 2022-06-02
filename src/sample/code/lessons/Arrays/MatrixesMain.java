package sample.code.lessons.Arrays;

public class MatrixesMain {

    public static void main(String[] args) {
        int[][] numberGrid = { //This is a 3x4 matrix i.e [3][4]
                {1,2,3},
                {4,5,6,},
                {7,8,9},
                {0}
        };

        System.out.println("===========Our 3x4 Origal matrix========");
        for(int i=0; i<numberGrid.length; i++){
            for (int j=0; j<numberGrid[i].length; j++){
                System.out.print(numberGrid[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("===========Multiplying two matrix========");
        //First we have to check if they match. the number of columns in the first matrix has to be the
        // same as the number of rows in the 2nd matrixs
        int mat1[][] = {{1, 2, 3}, //2x3 matrix
                {4, 5,6}
        };
        int mat2[][] = { //3x2 matrix
                {1, 2},
                {3, 4},
                {5, 6}
        };

        //checking if they are the same
        if(mat1[0].length != mat2.length){
            //if the number of column in the 1st matrix is not equal to the number of rows in the 2nd matrix
            //multiplication cannot be performed.
            System.out.println("Multiplication Undefined.");
        }else{
            int [][] result = multiply(mat1, mat2);
            //looping through the answer
            for (int row =0;row<result.length; row++){
                for (int column = 0; column<result[0].length; column++){
                    //printing the result
                    System.out.print(result[row][column] + " ");
                }
                System.out.println();
            }
        }

        System.out.println("===========8x8 Chess Board Colors Matrix========");
        String[][] chess1 = {
                {"W","B","W","B","W","B","W","B"},
                {"B","W","B","W","B","W","B","W"},
                {"W","B","W","B","W","B","W","B"},
                {"B","W","B","W","B","W","B","W"},
                {"W","B","W","B","W","B","W","B"},
                {"B","W","B","W","B","W","B","W"},
                {"W","B","W","B","W","B","W","B"},
                {"B","W","B","W","B","W","B","W"},
        };


        for(int i=0; i<chess1.length; i++){
            for (int j=0; j<chess1[0].length; j++){
                System.out.print(chess1[i][j] +" ");
            }
            System.out.println();
        }
        System.out.println("===========End 8x8 Chess Board Colors Matrix========");

    }

    private static int[][] multiply(int[][] mat1, int[][] mat2) {

        int[][] answer = new int[mat1.length][mat2[0].length]; //local variable and alocated the storage size.
        for (int row=0; row<mat1.length;row++){
            for (int column=0; column<mat2[0].length; column++){

                for (int i=0; i<mat1[0].length; i++){
                    answer[row][column] += mat1[row][i] * mat2[i][column];
                }

            }
        }

        return answer;
    }


}
