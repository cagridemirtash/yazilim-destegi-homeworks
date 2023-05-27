import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3}, {4,5,6}};
        int[][] tMatrix = new int[matrix[0].length][matrix.length];

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                //Change like this -> tMatrix[1][0] = matrix[0][1]
                tMatrix[j][i] = matrix[i][j];
            }
        }

        for(int[] row: tMatrix) {
            for(int col: row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}