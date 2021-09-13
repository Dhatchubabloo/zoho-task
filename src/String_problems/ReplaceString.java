package String_problems;

public class ReplaceString {
    public static void main(String[] args) {
        String line = "hellofox foxx fox hello";
        String word = "fox";
        String replace = "cat";
        String []array = line.split(" ");
        for(int i=0;i< array.length;i++){
            if(array[i].equals(word))
                array[i] = replace;
            else{
                int count=0;  int y=0;
                char arr[] = array[i].toCharArray();
                for(int j=0;j<arr.length;j++){
                    if(y<word.length()&&arr[j]==word.charAt(y)){
                        count++;
                        y++;
                    }
                    if(count==word.length()){
                        int val = j-count,k=0;
                        while(k<count) {
                            arr[val + 1] = replace.charAt(k);
                            val++;k++;
                        }
                        String str = new String(arr);
                        array[i] = str;
                        break;
                    }
                }
            }
        }
        for(String i:array)
            System.out.print(i+" ");
    }
}
