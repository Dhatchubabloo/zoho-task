package pattern;

import java.util.Scanner;

public class Z_pattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for(int i=0;i<num;i++){
            if(i==0||i==num-1){
                for(int j=0;j<num;j++){
                    System.out.print("*");
                }
            }
            else{
                for(int j=0;j<num;j++){
                    if(j==num-1-i){
                        System.out.print("*");
                    }
                    else
                        System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
