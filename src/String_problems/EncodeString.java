package String_problems;

public class EncodeString {
    public static void main(String[] args) {
        String str ="3[a]2[bc]";
        int number=0;String word ="";
        char array[] = str.toCharArray();
        for(int i=0;i< array.length;i++){
            if(array[i]>=48&&array[i]<=57)
                number = array[i]-48;
            else{
                if(array[i]=='['){
                    word+=args[i+1];
                }

            }
        }
    }
}
