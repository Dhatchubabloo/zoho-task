package MathematicsProbs;

import java.util.Scanner;

public class WorkerTime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int array[] = new int[num*2];
        for(int i=0;i<num*2;i++){
            array[i] = scan.nextInt();
        }
        int count=1;
        for(int i=1;i< array.length;i+=2){
            for(int j=i+i;j<= array.length;j+=2){
                if(array[j]> array[i-1]&&array[j]<array[i]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
