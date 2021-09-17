package Array_problems;

import java.util.ArrayList;

public class UnionAndIntersection {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5};
        int array1[] = {2,5,7,3};
        ArrayList list = new ArrayList();
        for(int i=0;i< array.length;i++){
            if(list.contains(array[i]))
                continue;
            else
                list.add(array[i]);
        }
        for(int i=0;i< array1.length;i++){
            if(list.contains(array1[i]))
                continue;
            else
                list.add(array1[i]);
        }
        System.out.println(list);
    }
}
