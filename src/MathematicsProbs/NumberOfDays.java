package MathematicsProbs;

import java.util.Scanner;

public class NumberOfDays {
    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
        int d1 = 10, m1 = 2, y1 = 2000;
        int d2 = 10, m2 = 3, y2 = 2000;
        int days=0,months=0,year=0;
        if(d1>d2||d2>d1) {
             days = Math.abs(d1 - d2);
        }
        if(m1>m2||m2>m1){
             months = Math.abs(m1-m2);
        }
        if(y1>y2||y2>y1){
             year = Math.abs(y1-y2);
        }
        System.out.println(days+","+months+","+year);

    }
}
