package Number_patterns;

import java.util.Scanner;

public class ProgramPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        char array[] = word.toCharArray();
        int len = word.length();
        int mid = len/2;
        int row = len;
        int col = 2;int j=0;int count=0;
        char result [][] = new char[row][col];
        for(int i=0;i< array.length;i++){
            if(i<=mid)
                result[i][j] = array[i];
            else{
                if(count==0) {
                    j++;
                    count++;
                }
                result[i][j] = array[i];
            }
        }
        j=0;
        int n=0;
        for(int i= array.length-1;i>=0;i--){
            if(i<mid)
                result[i][j]=array[n];
            else if(i==mid){
                j++;
                result[i][j]=' ';
            }
            else
                result[i][j] = array[n];
            n++;
        }
        for(int i=0;i<row;i++){
            for(int k=0;k<col;k++){
                System.out.print(result[i][k]+" ");
            }
            System.out.println();
        }
    }
}
