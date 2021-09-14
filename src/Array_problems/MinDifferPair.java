package Array_problems;

public class MinDifferPair {
    public static void main(String[] args){
        int array[] ={3, 10, 8, 6};
        int diff=array[0]-array[1];
        if(diff<0)
            diff*=(-1);
        for(int i=0;i< array.length;i++){
            for(int j=i+1;j< array.length;j++){
                int diff1 = array[i]-array[j];
                if(diff1<0)
                    diff1*=(-1);
                if(diff1<diff){
                    diff =diff1;
                }
                if(diff==1){
                    break;
                }
            }
        }
        System.out.println("The Min Differ is : "+diff);
    }
}
