package String_problems;

import java.util.ArrayList;

public class RemoveContigiousChar {
    public static void main(String[] args) {
        String str = "geegsforgeeeks";
        int range = 3; ArrayList charList;
        boolean flag = true;String output="";
        while(flag) {
            String result = "";
            int val = 0;
            charList = new ArrayList();
            for (int i = 0; i < str.length(); i++) {
                charList.add(str.charAt(i));
            }
            for (int i = 0; i < charList.size() ; i++) {
                int count = 0;
                for (int j = i; j<charList.size()&&j < range + i; j++) {
                    if (charList.get(i) == charList.get(j)) {
                        count++;
                    } else
                        break;
                }
                if (count == range) {
                    for (int j = 0; j < range; j++) {
                        charList.remove(i);
                    }
                    val++;
                }
            }
            for (int i = 0; i < charList.size(); i++) {
                result += charList.get(i);
            }
            if(val==0){
            break;
            }
            else
                str = result;
            output = result;
        }
        System.out.println(output);
    }
}
