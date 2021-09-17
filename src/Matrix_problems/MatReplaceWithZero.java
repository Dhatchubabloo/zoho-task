package Matrix_problems;

public class MatReplaceWithZero {
    public static void main(String[] args) {
        int mat[][] = {{1,1,1,0},
                {1,0,0,1},
                {0,0,0,1},
                {1,1,1,1}};
        int row=4,col=4;
        int max=0,index=0;
        for(int i=0;i<row;i++){
            int count=0;
            for(int j=0;j<col;j++){
                if(mat[i][j]==1)
                    count++;
            }
            if(count>max){
                max = count;
                index=i;
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i==index){
                    mat[i][j]=0;
                }
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
