package Array_problems;
/*
order O(nlogn)
 */
public class PeakElement {
    public static void main(String[] args) {
        int array[] = {4,7,8,9,10,6,5};
        if(array[0]>array[1])
            System.out.println(0);
        else if(array[array.length-1]>array[array.length-2])
            System.out.println(array.length-1);
        else {
            for (int i = 1; i < array.length - 1; i++) {
                if (array[i] >= array[i - 1] && array[i] >= array[i + 1]) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
