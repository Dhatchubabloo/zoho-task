package Array_problems;

public class MakeMatrixZero {
    public static void main(String[] args) {
        int matrix[][] = {
                {1,1,1},
                {1,0,1},
                {1,1,1}};
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(matrix[i][j]==0){
                    for(int k=0;k<3;k++){
                        matrix[i][k]=0;
                    }
                    for(int k=0;k<3;k++){
                        matrix[k][j]=0;
                    }
                    break;
                }
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
