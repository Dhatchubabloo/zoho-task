package sorting;

import java.util.Arrays;

public class CandyStore {
    public static void main(String[] args) {
        int offer = 4;
        int array[] = {3 ,2, 1, 4, 5};
        Arrays.sort(array);
        int len = array.length-offer;
        int min=0,max=0;
        int j=array.length-1;
        for(int i=0;i<len;i++){
            min+=array[i];
            max+=array[j];
            j--;
        }
        System.out.println(min);
        System.out.println(max);
    }
}
