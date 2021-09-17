package pattern;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for(int i=0;i<num;i++){
            for(int j=0;j<num-i;j++){
                System.out.print(" ");
            }
            for(int j=num-i;j<=num;j++){
                if(j==num)
                System.out.print("* ");
                else
                    System.out.print("**");
            }
            System.out.println();
        }
        for(int i=num-2;i>=0;i--){
            for(int j=num-1;j>=i;j--){
                System.out.print(" ");
            }
            for(int j=i;j>=0;j--){
                if(j==0)
                    System.out.print("* ");
                else
                    System.out.print("**");
            }
            System.out.println();
        }
    }
}
