package Array_problems;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatingElement {
    public static void main(String[] args) {
        int array[] = {1,2,4,2,4};int value=1;
        HashMap<Integer,Integer> map = new HashMap();
        for(int i=0;i< array.length;i++){
            if(map.containsKey(array[i])){
                int val = map.get(array[i]);
                map.put(array[i],++val);
            }
            else
                map.put(array[i],value);
        }
        for(Map.Entry<Integer,Integer>entry:map.entrySet())
            if(entry.getValue()==1){
                System.out.println("The Non-repeating element : "+entry.getKey());
            }
    }
}
