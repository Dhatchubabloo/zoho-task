package MathematicsProbs;

import java.util.Scanner;

public class SquareCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x1 = 20,y1 =10,x2 =10,y2 =20,x3 =20,y3 =20,x4 =10,y4 =10;
        String val = isSquare(x1,y1,x2,y2,x3,y3,x4,y4);
        System.out.println(val);
    }
    static String  isSquare(int x1,int y1,int x2,int y2,int x3,int y3,int x4,int y4){
        int val1 = Math.abs(x1-x3);
        int val2 = Math.abs(x2-x4);
        int val3 = Math.abs(y1-y3);
        int val4 = Math.abs(y2-y4);
        if(x1==x3&&x2==x4&&y1==y3&&y2==y4)
            return "No";
        if(val1==val2&&val3==val4)
            return "Yes";
        else
            return "No";

    }
}
