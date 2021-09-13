package String_problems;

public class FindLastWordLength {
    public static void main(String[] args) {
        String str = "Hey guys how are your               earth          ";
        int count=0;
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)!=' '){
                count++;
                if(str.charAt(i-1)==' '){
                    break;
                }
            }
        }
        System.out.println("count of last word : "+count);
    }
}
