package sorting;

import java.util.Arrays;

public class MinSwapSort {
    public static void main(String[] args) {
        int nums[] = {10, 19, 6, 3, 5};
        int len = nums.length;
        int count=0;
        for(int i=0,j=len-1;i<j;i++){
            if(nums[i]>nums[j]){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j]=temp;
                count++;
                j--;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
