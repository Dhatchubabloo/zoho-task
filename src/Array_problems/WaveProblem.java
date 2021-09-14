package Array_problems;

import java.util.Arrays;

public class WaveProblem {
    public static void main(String[] args) {
        int array[] = {2,4,7,8,9,10};
        for(int i=0;i< array.length;i+=2){
            if(i!= array.length-1) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
