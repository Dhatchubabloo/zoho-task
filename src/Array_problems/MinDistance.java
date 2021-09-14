package Array_problems;

import java.util.ArrayList;

public class MinDistance {
    public static void main(String[] args) {
        int array[] = {3,5,4,2,6,5,6,6,5,4,8,3};
        int x=3;
        int y=6;
        ArrayList<Integer>list = new ArrayList<>();
        int start=0;int end=0;
        for(int i=0;i< array.length;i++) {

            if (array[i] == x) {
                start = i;
            } else if (array[i] == y) {
                end = i;
            }
            if (end != 0 || start != 0)
                list.add(Math.abs(end - start));
        }
        int min = list.get(0);
        for(int i=0;i< list.size();i++){
            if(list.get(i)<min){
                min = list.get(i);
            }
        }
        System.out.println("The min distance is : "+min);
    }
}
