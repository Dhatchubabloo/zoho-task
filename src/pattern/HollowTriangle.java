package pattern;

import java.util.Scanner;

public class HollowTriangle {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int num = scan.nextInt();
        for(int i=0;i<num;i++){
            for(int j=0;j<num-i;j++) {
                System.out.print(" ");
            }
            for(int j=num-i;j<=num;j++){
                if(i!=num-1){
                    if(j==num-i||j==num)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }
                else{
                    if(j==num)
                        System.out.print("*");
                    else
                        System.out.print("**");
                }
            }
            System.out.println();
        }
    }
}
