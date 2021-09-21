package sorting;

import java.util.Arrays;

public class SumCloseToZero {
    public static void main(String[] args) {
        int nums [] = {-21, -67, -37, -18, 4, -65};
        int len = nums.length-1;
        new QuickSort().quickSort(nums,0,len);
        System.out.println(Arrays.toString(nums));
        for(int i=0;i< nums.length;i++){
            if(nums[i]>=0){
                if(i-1>=0){
                    System.out.println(nums[i]+nums[i-1]);
                }
                else
                    System.out.println(nums[len]+nums[len-1]);
                break;
            }
            else
                System.out.println(nums[len]+nums[len-1]);
            break;
        }
    }
    int[] quickSort(int []array,int left,int right){
        if(left<right){
            int i=left,j=right;
            int pivot = array[left];
            while(i<j){
                i=i+1;
                while(i<=right&&array[i]<pivot){
                    i++;
                }
                while(j>=left&&array[j]>pivot){
                    j--;
                }
                if(i<j&&i<=right){
                    swap(array,i,j);
                }
            }
            swap(array,left,j);
            quickSort(array,left,j-1);
            quickSort(array,j+1,right);
        }
        return array;
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }



}
