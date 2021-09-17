package Matrix_problems;

public class SpiralForm {
    public static void main(String[] args) {
        int mat[][]={{1,2,3},
                {4,5,6},
                {7,8,9}};
        int row = 3;int col=3;
        int a=0;
        int b=col-1;
        int c=0;
        int d=row-1;
        while(a<=b && c<=d){
            for(int i=a; i<=b; i++){
                System.out.print(mat[c][i]+" ");
            }
            c++;
            for(int i=c; i<=d; i++){
                System.out.print(mat[i][b]+" ");
            }
            b--;
            for(int i=b; i>=a; i--){
                System.out.print(mat[d][i]+" ");
            }
            d--;
            for(int i=d; i>=c; i--){
                System.out.print(mat[i][a]+" ");
            }
            a++;
        }
    }
}
