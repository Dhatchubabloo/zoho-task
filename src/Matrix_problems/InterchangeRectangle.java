package Matrix_problems;

import java.util.ArrayList;

public class InterchangeRectangle {
    public static void main(String[] args) {
        int mat[][] = {{4, 8},
                {3, 6},
                {10, 20},
                {15, 30}};
        ArrayList divList = new ArrayList();
       for(int [] rows : mat){
           float div =(float) rows[0]/rows[1];
           divList.add(div);
        }
       int count=0;
        for(int i=0;i< divList.size();i++){
            for(int j=i+1;j< divList.size();j++){
                if(divList.get(i).equals(divList.get(j)))
                    count++;
            }
        }
        System.out.println(count);
    }
}
