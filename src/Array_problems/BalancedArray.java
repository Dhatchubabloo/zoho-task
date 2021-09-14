package Array_problems;

public class BalancedArray {
    public static void main(String[] args) {
        int array[] = {11, 5, 3, 2};
        int len = array.length;int first=0,second=0;
        for(int i=0,j=len-1;i<j;i++,j--){
            first+=array[i];
            second+=array[j];
        }
        int diff = Math.abs(first-second);
        System.out.println(diff);
    }
}
