package Number_patterns;

import java.util.Scanner;

public class SpiralNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int row = (number*2)-1;
        int col = (number*2)-1;
        int mat[] [] = new int[row][col];
        int rowstart =0,rowend = row-1;
        int colstart=0,colend=col-1;
        while(rowstart<=rowend&&colstart<=colend){
            for(int i=rowstart;i<=colend;i++){
                mat[rowstart][i] =number;
            }
            rowstart++;
            for(int i=rowstart;i<=colend;i++){
                mat[i][colend]=number;
            }
            colend--;
            for(int i=colend;i>=colstart;i--){
                mat[rowend][i] = number;
            }
            rowend--;
            for(int i=rowend;i>=rowstart;i--){
                mat[i][colstart] = number;
            }
            colstart++;
            number--;
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(mat[i][j]<10)
                    System.out.print(mat[i][j]+"  ");
                else
                    System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
