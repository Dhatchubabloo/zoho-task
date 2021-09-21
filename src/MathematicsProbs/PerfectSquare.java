package MathematicsProbs;

import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int mid = num/2;
        for(int i=1;i<=mid+1;i++){
            int val = i*i;
            if(val==num){
                System.out.println(i);
                break;
            }
            else if(val>num){
                System.out.println(i-1);
                break;
            }
        }
    }
}
