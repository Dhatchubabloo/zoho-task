package MathematicsProbs;

import java.util.Scanner;

public class RectangleBox {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int wire = scan.nextInt();
        int paper = scan.nextInt();
        long val = getVol(wire,paper);
        System.out.println(val);
    }
    static long getVol(int A, int B) {
        double p =A;
        double s =B;

        long a = (long)(36*p*s - Math.pow(p, 3) + Math.sqrt(Math.pow((p*p - 24*s), 3))) / (12*72);
        if(a<0){
            a=0;
        }
        return a;
    }
}
