package String_problems;

import java.util.ArrayList;

public class StringPatternMatcher {
    public static void main(String[] args) {
        String pattern = "acba";
        String matcher = "dog dog fish dog";
        boolean res = new StringPatternMatcher().pattern(pattern,matcher);
        System.out.println(res);
    }
    boolean pattern(String pattern,String matcher){
            String array[] = matcher.split(" ");
            ArrayList list = new ArrayList();
            if(pattern.length()== array.length){
                int count=0;
                for(int i=0;i< array.length;i++) {
                    if(list.contains(pattern.charAt(i))) {
                        int index = list.indexOf(pattern.charAt(i));
                        if(list.get(index+1).equals(array[i])){
                            continue;
                        }
                        else {
                            count++;
                            break;
                        }
                    }
                    list.add(pattern.charAt(i));
                    if(list.contains(array[i])) {
                        return false;
                    }
                        else
                    list.add(array[i]);
                }
                return count == 0;
            }
            else
                return false;
    }
}
