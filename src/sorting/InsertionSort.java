package sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int array[] = {10, 169, 6, 3, 9};
        int len = array.length;
        for(int i=0;i<len;i++){
            int key = array[i];
            int j = i-1;
            while(j>=0&&key<array[j]){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = key;
        }
        System.out.println(Arrays.toString(array));
    }
}
