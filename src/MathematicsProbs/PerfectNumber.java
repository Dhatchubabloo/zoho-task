package MathematicsProbs;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println(isPerfect(num));
    }
    static int isPerfect(int num){
        int sum=0;
        for(int i=1;i<=num/2;i++){
            if(num%i==0)
                sum+=i;
        }
        if(sum==num)
            return 1;
        else
            return 0;
    }
}
