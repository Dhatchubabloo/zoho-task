package Number_patterns;

import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int temp=0,value=0;
        for(int i=0;i<num;i++){
            int count=0;
            value=i+1;
            for(int j=0;j<num-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=temp;j++){
                System.out.print(value);
                if(value>1&&count==0)
                    value--;
                else {
                    count++;
                    value++;
                }
            }
            temp+=2;
            System.out.println();
        }
        temp-=4;
        int val = 1;
        for(int i=num-2;i>=0;i--){
            int value1 = i+val,count=0;
            for(int j=num-1;j>=i;j--){
                System.out.print(" ");
            }
            for(int j=0;j<=temp;j++){
                System.out.print(value1);
                if(value1>1&&count==0)
                    value1--;
                else {
                    count++;
                    value1++;
                }
            }
            temp-=2;
            System.out.println();
        }
    }
}
