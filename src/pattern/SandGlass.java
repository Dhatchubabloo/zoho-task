package pattern;

import java.util.Scanner;

public class SandGlass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for(int i=0;i<num;i++){
            for(int j=num-i;j<=num;j++){
                System.out.print(" ");
            }
            for(int j=0;j<num-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=0;i<num;i++){
            for(int j=0;j<num-i;j++){
                System.out.print(" ");
            }
            for(int j=num-i;j<=num;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
