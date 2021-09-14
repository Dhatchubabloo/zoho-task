package Array_problems;

import java.util.Arrays;
import java.util.Scanner;

/*
Given an array arr[] and an integer K and integer N where K&N are smaller than size of array,
the task is to find the Kth smallest element and Nth largest element in the given array. and find sum of that two values...N = 6
arr[] = 7 10 4 3 20 15
K = 3  N = 2
Output : 7+15=22
 */
public class MaxMinSum {
    public static void main(String[] args) {
        int array[] = {10,30,50,70,100};
        int small = 3;
        int large = 2;int min=0,max=0;
        for(int j=0;j<small;j++) {
            min = array[0];
            int index = 0;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
                    index = i;
                }
            }
            array[index] = 1000;
        }
        if(array[0]==1000){
            large++;
        }
        for(int j=0;j<large;j++) {
            max = array[0];
            int index = 0;
            for (int i = 1; i < array.length; i++) {
                if(array[i]!=1000) {
                    if (array[i] > max) {
                        max = array[i];
                        index = i;
                    }
                }
            }
            array[index] = -1;
        }
        System.out.println("sum of kth smallest and nth largest value : ");
        System.out.println(min+max);
    }
}
