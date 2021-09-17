package Array_problems;

public class RemoveDuplicateFromSort {
    public static void main(String[] args) {
        int array[] = {1, 2, 2};String val="";
        int temp =0;
        for(int i=0;i< array.length;i++){
            if(array[i]==temp)
                continue;
            else {
                val += array[i];
                temp=array[i];
            }
        }
        for(int i=0;i<val.length();i++){
            array[i] = val.charAt(i)-48;
        }
        for(int i=0;i<val.length();i++){
            System.out.print(array[i]+" ");
        }
    }
}
