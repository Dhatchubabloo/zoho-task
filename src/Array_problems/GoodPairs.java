package Array_problems;

public class GoodPairs {
    public static void main(String[] args) {
        int array[] = {1,1,1,1};int count=0;
        for(int i=0;i< array.length;i++){
            for(int j=i+1;j< array.length;j++){
                if(array[i]==array[j]){
                    count++;
                }
            }
        }
        System.out.println("Number of good pairs : "+count);
    }
}
