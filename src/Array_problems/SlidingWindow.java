package Array_problems;

import java.util.Arrays;

public class SlidingWindow {
    public static void main(String[] args) {
        int array[] = {1,3,-1,-3,5,3,6,7};
        int len = array.length;
        int range  =3;
        int temp [] = new int[len-range+1];int k=0;
        for(int i=0;i<=array.length-range;i++){
            int max=array[i];
            for(int j=i;j<range+i;j++){
                if(array[j]>max){
                    max = array[j];
                }
            }
            if(k< temp.length)
            temp[k++] = max;
        }
        System.out.println(Arrays.toString(temp));
    }
}
