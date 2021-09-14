package Array_problems;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int array[] = {3,1,3,2,2,2};
        int len = array.length;
        int cmp = len/2;int value=1;
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i=0;i<len;i++){
            if(map.containsKey(array[i])){
                int val = map.get(array[i]);
                map.put(array[i],val+1);
            }
            else
            map.put(array[i],value);
        }
        System.out.println(map);
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            if(entry.getValue()>=cmp){
                System.out.println("The Majority element is : "+entry.getKey());
                break;
            }
        }
    }
}
