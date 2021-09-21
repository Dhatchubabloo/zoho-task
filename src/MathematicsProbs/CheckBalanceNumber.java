package MathematicsProbs;

import java.util.Scanner;

public class CheckBalanceNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String num = scan.next();
        System.out.println(isBalance(num));
    }
  static int  isBalance(String num){
        int mid = num.length()/2;
        int sum1=0;
        for(int i=0;i<mid;i++){
            sum1+=(num.charAt(i)-48);
        }
        int sum2=0;
      for(int i=mid+1;i<num.length();i++){
          sum2+=(num.charAt(i)-48);
      }
      if(sum1==sum2)
          return 1;
      else
          return 0;
   }

}
