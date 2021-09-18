package sorting;

import java.util.Arrays;

public class KthSmallest {
    public static void main(String[] args) {
        int array [] = {7 ,10, 4, 8, 20, 15};
        int x = 2;
        quicksort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
        System.out.println(array[x-1]);
    }
    private static void quicksort(int[] array, int left, int right) {
        if(left<right){
            int i = left,j=right;
            while(i<j){
                int pivot = array[left];
                i=i+1;
                while(i<=right&&array[i]<pivot)
                    i++;
                while(j>=left&&array[j]>pivot)
                    j--;
                if(i<j)
                    swap(array,i,j);
            }
            swap(array,j,left);
            quicksort(array,left,j-1);
            quicksort(array,j+1,right);
        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j]=temp;
    }
}
