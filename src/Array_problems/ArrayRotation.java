package Array_problems;

import java.util.Arrays;

public class ArrayRotation {
    public static void main(String[] args) {
        int array[] = {4,3,5,4,2};
        for(int j=0;j< array.length;j++) {
            int temp = array[array.length - 1];
            for (int i = array.length - 1; i >0; i--) {
                array[i] = array[i - 1];
            }
            array[0] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
