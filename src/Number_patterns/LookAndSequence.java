package Number_patterns;

import java.util.Scanner;

public class LookAndSequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        String val="1";
        System.out.println(val);
        for(int i=0;i<num-1;i++){
            String temp= "";
            char var = val.charAt(0);
            int count=1;
            for(int j=1;j<val.length();j++){
                if(var!=val.charAt(j)){
                    temp+=count+""+var;
                    count=0;
                    var = val.charAt(j);
                }
                count++;
            }
            temp+=count+""+var;
            System.out.println(temp);
            val= temp;
        }
    }
}
