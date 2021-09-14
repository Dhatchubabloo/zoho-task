package Array_problems;

import java.util.Arrays;

public class AltPosNegNumber {
    public static void main(String[] args) {
        int array[] = {-5, -2, 5, 2, 4, 7, 1, -8, 0, 8};
        int len = array.length;
        int result[] = new int[array.length];int odd=1,even=0;
        int poscount=0,negcount=0,oddcount=0,evencount=0;
        for(int i=0;i< array.length;i++){
            if(array[i]>=0)
                poscount++;
            else
                negcount++;
        }
        for(int i=0;i< array.length;i++){
            int val=0,count=0;
            if(array[i]>=0){
                val++;
                if(even<len) {
                    count++;
                    evencount++;
                    result[even] = array[i];
                    even+=2;
                }
                if(val>0&&count==0) {
                    int temp = odd;
                    int diff = Math.abs(oddcount-negcount);
                    temp = temp+(diff*2);
                    result[temp] = array[i];
                    odd+=2;
                }
            }
            else{
                if(odd<len) {
                    oddcount++;
                    result[odd] = array[i];
                    odd += 2;
                }
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
