package Matrix_problems;

import java.util.ArrayList;

public class ChangeZeroRowsCols {
    public static void main(String[] args) {
        int mat[][] = {{1, 1, 0},
                {1, 0, 1},
                {1, 1, 1}};
        int row = 3, col = 3;
        ArrayList<Integer> list = new ArrayList();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (mat[i][j] == 0) {
                    list.add(i);
                    list.add(j);
                }
            }
        }
        for(int i=0;i< list.size();i+=2){
            int k = list.get(i);
            for (int j = 0; j < row; j++) {
                    mat[k][j]=0;
                }
            k= list.get(i+1);
            for(int j=0;j<col;j++){
                mat[j][k]=0;
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
