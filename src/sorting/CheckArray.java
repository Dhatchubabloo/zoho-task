package sorting;
import java.util.HashMap;

public class CheckArray {
    public static void main(String[] args) {
        int array[] = {1,2,5,4,0};
        int array1[] = {2,4,5,2,1};
        HashMap<Integer,Integer> map = new HashMap();
        for(int i=0;i< array.length;i++){
            if(!map.containsKey(array[i])){
                map.put(array[i],1);
            }
            else {
                map.put(array[i],map.get(array[i])+1);
            }
        }
        int temp=0;
        for(int i=0;i< array.length;i++){
            if(map.containsKey(array1[i])){
                int count = map.get(array1[i]);
                map.put(array1[i],--count);
            }
            else {
                temp++;
                break;
            }
            if(map.get(array1[i])==0) {
                temp++;
                break;
            }
        }
        if(temp==0)
            System.out.println("same");
        else
            System.out.println("Not same");
    }
}
