package Matrix_problems;

public class Anti90Rotation {
    public static void main(String[] args) {
        int mat[][] = {{1, 2, 3,10},
                {4, 5, 6,11},
                {7, 8, 9,12},
                {13,14,15,16}};
        for(int i=0;i<4;i++){
            for(int j=i;j<4;j++){
                if(i!=j){
                    int temp = mat[i][j];
                    mat[i][j] = mat[j][i];
                    mat[j][i]=temp;
                }
            }
        }
        int val = 3;
        for(int i=0;i<4/2;i++){
            for(int j=0;j<4;j++){
                int temp = mat[i][j];
                mat[i][j] = mat[val][j];
                mat[val][j]=temp;
            }
            val--;
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
