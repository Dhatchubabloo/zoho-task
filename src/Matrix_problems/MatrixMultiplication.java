package Matrix_problems;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int mat[][]={{1,2},
                {3,4}};
        int row1=2;
        int mat1[][]={{1,1},
                {1,1}};
        int row2=2,col2=2;
        int result[][] = new int[row1][col2];
        for(int i=0;i<row1;i++){
            for(int j=0;j<col2;j++){
                int sum=0;
                for(int k=0;k<row2;k++){
                    sum+=mat[i][k]*mat1[k][j];
                }
                result[i][j]=sum;
            }
        }
        for(int i=0;i<row1;i++){
            for(int j=0;j<col2;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }

    }
}
