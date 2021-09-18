package sorting;

import java.util.Arrays;

public class MaximizeToys {
    public static void main(String[] args) {
        int nums[] = {1, 12, 5, 111, 200, 1000, 10};
        int amount = 100;
        int len = nums.length-1;
       // new QuickSort().quickSort(nums,0,len);
        int count=0;int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum<=amount){

            }
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
