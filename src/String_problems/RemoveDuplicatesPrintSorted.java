package String_problems;

public class RemoveDuplicatesPrintSorted {
    public static void main(String[] args) {
        String str = "dhatchinamoorthi";
        String result="";
        char array[] = str.toCharArray();
        for(int i=0;i< array.length;i++){
            if(array[i]!='1') {
                result+=array[i];
                for (int j = i + 1; j < array.length; j++) {
                    if(array[j]==array[i])
                        array[j]='1';
                }
            }
        }
        char resultArray[] = result.toCharArray();
        for(int i=0;i< resultArray.length;i++){
            for(int j=0;j< resultArray.length-1;j++){
                if(resultArray[j]>resultArray[j+1]){
                    char temp = resultArray[j];
                    resultArray[j] = resultArray[j+1];
                    resultArray[j+1] = temp;
                }
            }
        }
        String val = new String(resultArray);
        System.out.println(val);
    }
}
