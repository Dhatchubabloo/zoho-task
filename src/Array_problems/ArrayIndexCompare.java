package Array_problems;

public class ArrayIndexCompare {
    public static void main(String[] args) {
        int array1[] = {2,4,6,8,9,10,12};
        int array2[] = {2,4,6,8,10,12};
        for(int i=0;i<array1.length;i++){
            if(array1[i]!=array2[i]){
                System.out.println(i);
                break;
            }
        }
    }
}
