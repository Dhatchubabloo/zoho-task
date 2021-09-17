package Number_patterns;

import java.util.Scanner;

public class SimpleNumberPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for(int i=0;i<num;i++){
            int temp=1;
            for(int j=0;j<=i;j++){
                System.out.print(temp+" ");
                temp++;
            }
            System.out.println();
        }
    }
}
