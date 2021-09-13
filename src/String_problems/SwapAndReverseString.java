package String_problems;

public class SwapAndReverseString {
    public static void main(String[] args) {
        String str = "Hello this is GFG user";
        String array[]=str.split(" ");
        int i=0;
        String temp = array[i];
        if(array.length<=2){
            if(i<array.length-1){
                array[i] = array[i+1];
                array[i+1] = temp;
            }
        }
       else{
           int len = array.length;
           array[i] = array[len-1];
           array[len-1] = temp;
           for(i=1;i<len-1;i++){
               String res="";
               for(int k=array[i].length()-1;k>=0;k--){
                   res+=array[i].charAt(k);
               }
               array[i] = res;
           }
        }
       for(String val:array)
           System.out.print(val+" ");
    }
}
