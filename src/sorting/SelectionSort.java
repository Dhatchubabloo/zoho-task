package sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int nums[] = {5,8,3,1,9,6};
        int len = nums.length;
        for(int i=0;i<len;i++){
            int min = nums[i],index=i;
            for(int j=i+1;j<len;j++){
                if(nums[j]<min){
                    min = nums[j];
                    index=j;
                }
            }
            swap(nums,i,index);
        }
        System.out.println(Arrays.toString(nums));
    }

    private static void swap(int []nums, int i, int index) {
        int temp = nums[i];
        nums[i] = nums[index];
        nums[index] = temp;

    }
}
