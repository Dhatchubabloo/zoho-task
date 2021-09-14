package Array_problems;

import java.util.Arrays;

public class ArrayAdditionWithOne {
    public static void main(String[] args) {
        int array[] = {9,9,9,9};
        int digit=0;
        for(int i=0;i< array.length;i++){
                digit = (digit*10)+array[i];
        }
        int temp = ++digit;int count=0;
        while(temp>0){
            count++;
            temp/=10;
        }
        int result[] = new int [count];
        for(int i=count-1;i>=0;i--){
            int val =digit%10;
            result[i]=val;
            digit/=10;
        }
        System.out.println(Arrays.toString(result));
    }
}
