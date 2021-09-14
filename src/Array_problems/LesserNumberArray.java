package Array_problems;

import java.util.Arrays;

public class LesserNumberArray {
    public static void main(String[] args) {
        int array[] = {6,5,4,8};
        int result[] = new int[array.length];
        for(int i=0;i< array.length;i++){
            int count=0;
            for(int j=0;j< array.length;j++){
                if(array[j]<array[i]){
                    count++;
                }
            }
            result[i]=count;
        }
        System.out.println(Arrays.toString(result));
    }
}
