package MathematicsProbs;

import java.util.Scanner;

public class BinaryPalindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println(isPalindrome(num));
    }
    static boolean isPalindrome(int num){
        String str ="";
        while(num>0){
            str+=num%2;
            num/=2;
        }
        int i=0,j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;j--;
        }
        return true;
    }
}
