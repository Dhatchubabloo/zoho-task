package Array_problems;

public class KadanesAlgo {
    public static void main(String[] args) {
        int array[] = {-1,-2,-3,-4};
        int sum=0,max=array[0];
        for(int i=0;i< array.length;i++){
                sum+=array[i];

                if(sum>max)
                    max = sum;
                if(sum<0)
                    sum=0;

        }
        System.out.println(max);
    }
}
