package Matrix_problems;

import java.util.Arrays;

public class RotateGame {
    public static void main(String[] args) {
        int mat[][] = {{1, 2,1,2},
                {2, 1, 3, 1}};
        int times = 2;
        int row = 2;
        int col = 4;
        int result[][]=new int[row][col];
        for(int i=0;i<row;i++){
            int array[] = new int [col];
            for(int j=0;j<col;j++){
                array[j] = mat[i][j];
            }
            if(i%2==0) {
                System.out.println(Arrays.toString(array));
                for (int j = 0; j < times; j++) {
                    int temp = array[0];
                    for (int k = 1; k < array.length; k++) {
                        array[k - 1] = array[k];
                    }
                    array[array.length-1] = temp;
                }
            }
            else{
                System.out.println(Arrays.toString(array));
                for (int j = 0; j < times; j++) {
                    int temp = array[array.length - 1];
                    for (int k = array.length - 2; k >= 0; k--) {
                        array[k + 1] = array[k];
                    }
                    array[0] = temp;
                }
            }
            for (int k = 0; k < col; k++) {
                result[i][k] = array[k];
            }
        }
        if(new RotateGame().check(mat,result,row,col))
            System.out.println("Same Matrix");
        else
            System.out.println("Not Same");
    }
    boolean check(int[][]mat,int[][]result,int row,int col){
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++) {
                if(mat[i][j]!=result[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
