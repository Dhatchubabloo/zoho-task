package MathematicsProbs;

import java.util.Scanner;

public class PowerOfAnother {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        System.out.println(ispower(x,y));
    }

    private static int ispower(int x, int y) {
        int i=1;
        if(x==1&&y!=1){
            return 0;

        }
        else {
            while (true) {
                if (Math.pow(x, i) == y) {
                    return 1;
                } else if (Math.pow(x, i) > y)
                    return 0;
                i++;
            }
        }
    }
}
