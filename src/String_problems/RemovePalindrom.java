package String_problems;

import java.util.Scanner;

public class RemovePalindrom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String array[] = str.split(" ");
        int len = array.length;
        int count=0;
        for(int i=0;i<len;i++){
            StringBuffer sb = new StringBuffer(array[i]);
            String temp = new String(sb.reverse());
            if(array[i].equals(temp)){
                int j=i;
                while(j< array.length-1) {
                    array[j] = array[j + 1];
                    j++;
                }
                count++;
                i--;
               len--;
            }
        }
        for(int i=0;i< array.length-count;i++){
            System.out.println(array[i]);
        }
    }
}
