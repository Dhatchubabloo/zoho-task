package Array_problems;

import java.util.ArrayList;

public class MaxSumOfContigiousArray {
    public static void main(String[] args) {
        int array[] = {3,5,7,2,-9,10};
        int sum=0;int val=0;
        ArrayList<Integer>list = new ArrayList<>();
        int len = array.length;
        if(array[len-1]<0){
            len = len-1;
        }
        int min = array[0];
        for(int i=0;i< len;i++){
            if(array[i]>min){
                min=array[i];
            }
            sum+=array[i];
        }
        System.out.println(min);
        if(sum<=0){
            list.add(min);
        }
        list.add(sum);
        int cmp =0;
        for(int i=0;i< len;i++){
            if(array[i]>=0){
                cmp+=array[i];
            }
            else {
                if(cmp!=0)
                list.add(cmp);
                if(i<len-1&&array[i+1]>=0){
                    for(int j=i+1;j<len;j++){
                        val+=array[j];
                    }
                    list.add(val);
                    val=0;
                    cmp=0;
                }
            }
        }
        System.out.println(list);
        int max = list.get(0);
        for(int i=1;i< list.size();i++){
            if(list.get(i)>max){
                max = list.get(i);
            }
        }
        System.out.println("The sum of maximum contigious array is : "+max);
    }
}
