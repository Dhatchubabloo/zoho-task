package MathematicsProbs;

import java.util.Scanner;

public class LuckyNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println(isLucky(num));
    }
    static boolean isLucky(int num){
        int range = (int)Math.floor(Math.sqrt(num));
        if(num%2==0){
            return false;
        }
        else {
            int val=0;
            for (int i = 2; i <= range+2; i++) {
               if(num-val==i){
                   return false;
               }
                else{
                   val = num/i;
               }
            }
        }
        return true;
    }
}
