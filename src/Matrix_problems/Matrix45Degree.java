package Matrix_problems;

public class Matrix45Degree {
    public static void main(String[] args) {
        int mat[][]={{1,4,3,8},
                {4,2,8,1},
                {7,9,8,3},
                {1,2,4,9}};
        int row = 4,rowTemp=0,colTemp,val;
        for(int i=0;i<row;i++){
            colTemp=0;val=rowTemp;
            for(int j=0;j<row-i-1;j++){
                System.out.print(" ");
            }
            for(int j=row-i-1;j<row;j++){
                System.out.print(mat[val--][colTemp++]+" ");
            }
            rowTemp++;
            System.out.println();
        }
        int temp=0;
        System.out.println(rowTemp+"row");
        for(int i=0;i<row-1;i++){
            val = rowTemp-1;colTemp=temp;
            for(int j=0;j<i+1;j++){
                System.out.print(" ");
            }
            for(int j=row+i-(row-1);j<row;j++){
                System.out.print(mat[val--][++colTemp]+" ");
            }
            temp = colTemp-1;
            rowTemp++;
            System.out.println();
            System.out.println(rowTemp+" : rowtemp");
            System.out.println(val+": val");
            System.out.println(colTemp+": coltemp");
        }
    }
}
