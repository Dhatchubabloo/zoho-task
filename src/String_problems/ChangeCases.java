package String_problems;

import java.util.Scanner;

public class ChangeCases {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        char array[] = line.toCharArray();
        int len = array.length;
        for(int i=0;i<len;i++){
            if(array[i]>=65&&array[i]<=90){
                array[i] = (char)((int)array[i]+32);
            }
            else if(array[i]>=97&&array[i]<=122){
                array[i] =(char)((int)array[i]-32);
            }
        }
        for(char i:array)
            System.out.print(i+"");
    }
}
