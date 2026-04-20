import java.util.*;

//Problem : Calculate Diagonal Sum

public class DiagonalSum {
    public static int calcSum(int matrix[][]) {
        // Brute method ---> Time complexity O(n^2)
        // int sum = 0;
        // for(int i=0; i<matrix.length; i++){
        //     for(int j=0; j<matrix[0].length; j++){
        //         if(i==j){ 
        //             sum += matrix[i][j];
        //         }
        //         else if(i+j = matrix.length-1){
        //             sum += matrix[i][j];
        //         }
        //     }
        // }
            
        //Optimise method to find sum of diagonal in 2D array ---> Time complexity O(n)
        for(int i=0; i<matrix.length; i++){
            sum += matrix[i][i];
            if(i != matrix.length-i-1){
                sum += matrix[i][matrix.length-i-1];
            }
        }
        
        return sum;
    }
    public static void main(String args[]) {
        int matrix[][] = {{1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                        {13, 14, 15, 16}};
        calcSum(matrix);
    }
}
