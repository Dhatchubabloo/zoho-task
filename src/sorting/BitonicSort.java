package sorting;

public class BitonicSort {
    public static void main(String[] args) {
        int array [] = {3, 1, 2, 4, 5, 9, 13, 14, 12};
        int temp [] = new int[array.length];
        for(int j=0;j< array.length/2;j++) {
            int min=array[0];
            for (int i = 2; i < array.length; i += 2) {
                if(array[i]<min){
                    min = array[i];
                }
            }
            int max= array[1];
            for (int i = 3; i < array.length; i += 2) {

            }
        }
    }
}
