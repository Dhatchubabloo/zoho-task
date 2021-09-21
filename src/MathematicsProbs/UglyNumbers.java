package MathematicsProbs;

import java.util.Arrays;
import java.util.Scanner;

public class UglyNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       // int digit = scan.nextInt();
        int num = scan.nextInt();
        System.out.println(1);
        int j=0;int i=2;
        while(j<num){
            for(int k=2;k<=i;k++) {
                if ((k % 2 == 0 || k % 5 == 0 || k % 3 == 0)) {
                    continue;
                }
                else
                {
                    System.out.println(i);
                    j++;
                    break;
                }
            }
            System.out.println(i+"i");
            i++;
        }
    }
}
