package Internship_Programs;
import java.util.*;
public class Java_Program_For_Find_The_Transpose_Of_Given_Matrix {
	public static void main(String[] args) {
        int row = 2, column = 3;
        int[][] matrix = { {8, 4, 6}, {7, 3, 7} };

        show(matrix);

        // Transpose the matrix
        int[][] transpose01 = new int[column][row];
        for(int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                transpose01[j][i] = matrix[i][j];
            }
        }
       show(transpose01);
    }

    public static void show(int[][] matrix) {
        System.out.println("The matrix is: ");
        for(int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
    }

}
