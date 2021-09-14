package Array_problems;

import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,4,3,2,1};
        int result[] = new int[array.length];
        int len = array.length/2;
        int k=0;
        for(int i=0,j=len;i<len;i++,j++){
            result[k] = array[i];k++;
            result[k] = array[j];k++;
        }
        System.out.println(Arrays.toString(result));
    }
}
