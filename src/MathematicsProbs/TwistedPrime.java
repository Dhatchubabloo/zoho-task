package MathematicsProbs;

import java.util.Scanner;

public class TwistedPrime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println(isTwisted(num));
    }

    private static int isTwisted(int num) {
        int count=0;
        for(int i=2;i<num;i++){
            if(num%i==0){
                count++;
                break;
            }
        }
        if(count==0){
            int temp = num;
            num=0;
            while(temp>0){
                num = (num*10)+temp%10;
                temp/=10;
            }
            for(int i=2;i<num;i++){
                if(num%i==0){
                    count++;
                    break;
                }
            }
            if(count==0){
                return 1;
            }
            else
                return 0;
        }
        else
            return 0;

    }

}
