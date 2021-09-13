package String_problems;

public class PalindromicSubString {
    public static void main(String[] args) {
        String str = "appamalayalamappa";
        int len =0;
        String result="";
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    String temp = str.substring(i,j+1);
                    StringBuffer sb = new StringBuffer(temp);
                    String rev = new String(sb.reverse());
                    if(temp.equals(rev)){
                        if(temp.length()>len){
                            len=temp.length();
                            result=temp;
                        }
                    }
                }
            }
        }
        System.out.println("The palindromic susbstring is : ");
        System.out.println(result);
        System.out.println("The length : ");
        System.out.println(result.length());
    }
}
