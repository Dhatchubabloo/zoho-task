package Array_problems;

public class SubArrayWithZeroSum {
    public static void main(String[] args) {
        int array[] = {4 ,2 ,-3, 1, 6};
        int len = array.length;int count=0;
        for(int i=0;i< len;i++){
            if(array[i]==0){
                System.out.println("yes");
                break;
            }
            if(array[i]<0){
                count+=array[i];
            }
        }

    }
}
