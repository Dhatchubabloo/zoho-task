package String_problems;

public class OuterParaRemoval {
    public static void main(String[] args) {
        String str = "(()()((a)(bc)d))";
        char array[] = str.toCharArray();
        int start=0;int end=0;int count=0;
        for(int i=0,j=str.length()-1;i<j;i++,j--){
            start=i;end=j;
            if(array[i]=='('&&array[j]==')'){
                if(array[i+1]=='('&&array[j-1]==')'){
                    System.out.println("happy");
                    start=i+1;end=j-1;
                    count++;
                }
                else if(array[i+1]>=97&&array[i+1]<=122 && array[j-1]>=97&&array[j-1]<=122){
                    if(count==i)
                    start=i+1;end=j-1;
                   // System.out.println(count+"c"+i);
                    break;
                }
            }
            else {
                if(i==0&&j==str.length()-1)
                end = array.length - 1;
                break;
            }
        }
        System.out.println(start);
        System.out.println(end);
        String result="";
        for(int i=start;i<=end;i++){
            result+=str.charAt(i);
        }
        System.out.println(result);
    }
}
