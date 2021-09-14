package Array_problems;

public class ArrayPair {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5};
        int sum = 10;
        int len = array.length;
        int temp= array[len-1],sub= array[len-1]-array[len-2];
        for(int i= array.length-2;i>=0;i--){
            int add =temp+array[i];
            if(add<=sum){
                int diff = sum-add;
                if(diff<sub){
                    sub=diff;
                }
            }
        }
        System.out.print(sub+",");
        System.out.print(temp);
    }
}
