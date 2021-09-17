package Matrix_problems;

public class Celebrity {
    public static void main(String[] args) {
        int person[][] ={{0, 0, 1, 0,0},
                {0, 0, 1, 0,0},
                {0, 0, 1, 0,0},
                {0, 0, 1, 0,0},
                {0,0,0,0,0}};
        int row = 5,col=5;int column=0,rows=0,temp=0;
        for(int i=0;i<col;i++){
            if(person[temp][i]==1){
                column = i;
                break;
            }
        }
        for(int i=1;i<row;i++){
            if(person[i][column]==0){
                rows=i;
                break;
            }
        }
        int count=0;
        for(int i=0;i<col;i++){
            if(person[rows][i]!=0)
                count++;
        }
        if(count==0)
            System.out.println("The celebrity was : "+rows);
        else
            System.out.println("No celebrity");
    }
}
