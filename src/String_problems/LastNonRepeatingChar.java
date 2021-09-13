package String_problems;

import java.util.ArrayList;

public class LastNonRepeatingChar {
    public static void main(String[] args) {
        String word = "deepika11";
        int len  =word.length();
        ArrayList<Character> chatList = new ArrayList<>();
        for(int i=len-1;i>=0;i--){
            int count=0;
            if(chatList.contains(word.charAt(i)))
                continue;
            for(int j=i-1;j>=0;j--){
                char temp = word.charAt(i);
                    if (temp == word.charAt(j)) {
                        chatList.add(temp);
                        count++;
                        break;
                    }
                }
            if(count==0){
                System.out.println("The last non-repeating character :"+word.charAt(i));
                break;
            }
        }
    }
}
