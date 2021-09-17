package Matrix_problems;

import java.util.ArrayList;

public class UniqueRows {
    public static void main(String[] args) {
        int mat[][] = {{1, 2, 9},
                {1, 2, 7},
                {1, 2, 9},
                {1,2,7}};
        ArrayList<Integer> list = new ArrayList();
        for(int i=0;i<4;i++){
            int sum=0;
            for(int j=0;j<3;j++){
                sum = (sum*10)+mat[i][j];
            }
            System.out.println("Sum: >>>> "+sum);
            list.add(sum);
        }
        list.add(256);
        System.out.println(list);
        int len = list.size();
        for(int i=0;i<len;i++){
            System.out.println(list.get(i)+" :i :"+i);
            for(int j=i+1;j<len;j++){
                System.out.println(list.get(j)+" :j :"+j);
                if(list.get(i)==list.get(j)){
                    System.out.println(list.get(j)+" :j :"+j);
                    System.out.println("Matching found...........");
                }
                else{
                    System.out.println(" not matching!!! i: "+i+" j:"+j);
                }
            }
            System.out.println(list);
        }

//       for(int i=0;i<3;i++){
//            for(int j=0;j<3;j++){
//                if(i==0){
//                    System.out.println(mat[i][j]+" ");
//                }
//                else{
//
//                }
//            }
//           System.out.println();
//       }
    }
}
