package Array_problems;

public class JumpGame {
    public static void main(String[] args) {
        int array[] = {2,1,2,1,4};
        int len = array.length-1,val=0,out=0;
        for(int i=0;i< array.length;i++){
            int count=0;
            int jumps = array[i];
            if(jumps==len){
                out++;
                val++;
            }
            else {
                for (int j = 1; j <= jumps; j++) {
                    if (i + j >= len) {
                        count++;
                        out++;
                        val++;
                        break;
                    }
                }
                for (int k = i + 1; k < array.length; k++) {
                    int value =jumps+ array[k];
                    out++;
                    if (value >= len) {
                        count++;
                        out++;
                        val++;
                        break;
                    }
                }
            }
                if (val > 0)
                    break;
        }
        System.out.println(out);
    }
}
