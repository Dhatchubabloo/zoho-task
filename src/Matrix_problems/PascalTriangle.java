package Matrix_problems;

import java.util.ArrayList;

public class PascalTriangle {
    public static void main(String[] args) {
        int num = 6;int x = 3;
        ArrayList<ArrayList<Integer>> list = new ArrayList();
        for(int i=0;i<num;i++){
            ArrayList<Integer>inner = new ArrayList<>();
            if(i==0) {
                inner.add(1);
            }
            else{
                int k=0;
                ArrayList<Integer> temp = list.get(i-1);
                for (int j = 0; j <= i; j++) {
                    if (j == 0 || j == i)
                        inner.add(1);
                    else{
                        int val = temp.get(k)+temp.get(j);
                        inner.add(val);k++;
                    }
                }
            }
            list.add(inner);
        }
        for(int i=0;i< list.size();i++){
            ArrayList<Integer>temp = list.get(i);
            for(int j=0;j<num-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j< temp.size();j++){
                System.out.print(temp.get(j)+" ");
            }
            System.out.println();
        }
        System.out.println(list.get(x));
    }
}
