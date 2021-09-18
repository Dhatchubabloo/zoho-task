package String_problems;

public class IntegerToRoman {
    public static void main(String[] args) {
        int number[] = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String roman[] = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int value =4;String temp="";
        for(int i=0;i<number.length;i++){
            while(value>=number[i]){
                value=value-number[i];
                temp+=roman[i];
            }
        }
        System.out.println(temp);
    }
}
