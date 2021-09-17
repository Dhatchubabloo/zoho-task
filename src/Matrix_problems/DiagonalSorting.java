package Matrix_problems;


public class DiagonalSorting {
    public static void main(String[] args) {
        int mat[][] = {{5, 2, 0, 7, 1},
                {3 ,4 ,2 ,9 ,9},
                {5 ,1 ,3 ,5, 2},
                {4 ,2 ,6 ,2, 1}
                        ,{0 ,6 ,3 ,5, 1}};
        int row =5,col=5;
        int array[] = new int[row];
        for(int i=0;i<row;i++){
            array[i] = mat[i][i];
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<row-1;j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] =array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++) {
                if(i==j){
                    mat[i][j]=array[i];
                }
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
