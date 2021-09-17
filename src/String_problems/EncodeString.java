package String_problems;

public class EncodeString {
    public static void main(String[] args) {
        String str ="abc3[cd]xyz";
        int number=0;
        char array[] = str.toCharArray();
        for(int i=0;i< array.length;i++){
            String word ="";
            if(!(array[i]>=48&&array[i]<=57)){
                while(i< array.length&&array[i]>=97&&array[i]<=122){
                    word+=array[i];
                    i++;
                }
            }
            System.out.print(word);
            if(array[i]>=48&&array[i]<=57) {
                number = array[i] - 48;
                if (array[i + 1] >= 48 && array[i + 1] <= 57) {
                    number = (number * 10) + array[i + 1] - 48;
                    i++;
                }
            }
            else{
                if(array[i]=='['){
                    i++;
                    while(array[i]>=97&&array[i]<=122) {
                        word += array[i];
                        i++;
                    }
                    if(array[i]=='['){

                    }
                    for(int j=0;j<number;j++){
                        System.out.print(word);
                    }
                }
                if(array[i]==']'){
                    if(i+1< array.length&&!(array[i+1]>=48&& array[i + 1] <= 57)){
                        i++;
                        while(i< array.length&&array[i]>=97&&array[i]<=122){
                            word+=array[i++];
                        }
                        System.out.print(word);
                    }
                }
            }
        }
    }
}
