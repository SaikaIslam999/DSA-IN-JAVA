import java.util.*;

//Problem : Search for key in sorted matrix

public class SearchInSorted {
    public static boolean staircaseSearch(int matrix[][], int key) {   //Time Complexity --> O(n+m)
        int n = matrix.length, m = matrix[0].length;
        int i = 0, j = n-1;

        while(j>=0 && i<n) {
            if(matrix[i][j] == key) {
                System.out.println("Found at (" + i +"," + j + ")");
                return true;
            }
            //go down
            else if(matrix[i][j] < key) {
                i++;
            }
            //go left
            else if(matrix[i][j] > key) {
                j--;
            }

        }

        System.out.println("NOT Found");
        return false;
    }

    // bottom to right 
    public static boolean staircase(int matrix[][], int key){
        int row = matrix.length - 1;
        int col = 0;
        while(row >= 0 && col <= matrix[0].length-1){
            if(key == matrix[row][col]){
                System.out.println("key is found at index: "+ "("+ row+","+col+")");
                return true;
            }
            else if(key < matrix[row][col]){
                row--;
            }else{
                col++;
            }
        }
        System.out.println("key is not found");
        return false;
    }
    
    public static void main(String args[]) {
        int matrix[][] = {{10, 20, 30, 40},
                        {15, 25, 35, 45},
                        {27, 29, 37, 48},
                        {32, 33, 39, 50}};
        int key = 33;
        staircaseSearch(matrix, key);
    }
}
