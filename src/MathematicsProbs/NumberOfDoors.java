package MathematicsProbs;

import java.util.Scanner;

public class NumberOfDoors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int array[] = new int[num];
        for(int i=0;i<num;i++){
            array[i]=0;
        }
        for(int i=0;i<num;i++) {
            for (int j = i; j <num; j+=i+1) {
                if(array[j]==0)
                    array[j]=1;
                else
                    array[j]=0;
            }
        }
        int count=0;
        for(int i=0;i<num;i++){
            if(array[i]==1)
                count++;
        }
        System.out.println(count);
    }
}
