package Array_problems;

public class SumOfContigiousArray {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,6,7,8,9,10};
        int sum =15;int start=0;int val=0;
        for(int i=0;i< array.length;i++){
            val+=array[i];
            if(val==sum){
                System.out.print(start+1+",");
                System.out.print(i+1);
                break;
            }
            if(val>sum){
                i=start;
                val=0;
                start++;
            }
        }
    }
}
