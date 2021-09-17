package Number_patterns;

import java.util.Scanner;

public class XOpattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        int col = scan.nextInt();
        char mat[][] = new char[row][col];
        int rowstart = 0, rowend = row - 1;
        int colstart = 0, colend = col - 1;
        char temp;
        while (rowstart <= rowend && colstart <= colend) {
            if (rowstart % 2 == 0)
                temp = 'X';
            else
               temp = 'O';

            for (int i = colstart; i <= colend; i++) {
                mat[rowstart][i]=temp;
            }
            rowstart++;
            for (int i = rowstart; i <= rowend; i++) {
                    mat[i][colend] = temp;
            }
            colend--;
            for (int i = colend; i >= colstart; i--) {
                    mat[rowend][i] = temp;
            }
            rowend--;
            for (int i = rowend; i >= rowstart; i--) {
                    mat[i][colstart] = temp;
            }
            colstart++;
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (mat[i][j] < 10)
                    System.out.print(mat[i][j] + "  ");
                else
                    System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
