package String_problems;

import java.util.ArrayList;
import java.util.Scanner;

public class FrequentCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        ArrayList<Object> frequent = new ArrayList();
        for(int i=0;i<str.length();i++){
            if(frequent.contains(str.charAt(i)))
                continue;
            frequent.add(str.charAt(i));
            int count=0;
            for(int j=0;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            frequent.add(count);
        }
        int max=0; int index=0;
        for(int j=0;j<2;j++) {
            index=1;
            max = (Integer) frequent.get(1);
            for (int i = 3; i < frequent.size(); i+=2) {
                if((Integer)frequent.get(i)>max){
                    max = (Integer) frequent.get(i);
                    index = i;
                }
            }
            frequent.remove(index);
            frequent.add(index,-1);
        }
        System.out.println("The 2nd Most frequent character in the given String");
        System.out.println(frequent.get(index-1));
    }
}
