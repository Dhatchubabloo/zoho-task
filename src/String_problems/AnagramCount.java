package String_problems;

public class AnagramCount {
    public static void main(String[] args) {
        String array[] = {"act","dog","god","is","tac"};
        int len = array.length;
        String cmp[] = new String[len];
        for(int i=0;i< array.length;i++){
            char arr[] = array[i].toCharArray();
            for(int j=0;j<arr.length;j++){
                for(int k=0;k< arr.length-1;k++){
                    if(arr[k]>arr[k+1]){
                        char temp = arr[k];
                        arr[k] = arr[k+1];
                        arr[k+1] = temp;
                    }
                }
            }
            String newString = new String(arr);
            cmp[i] = newString;
        }
        System.out.println("The anagram words are");
        for(int i=0;i< array.length;i++){
            if(array[i].equals("123"))
                continue;
            for(int j=0;j< array.length;j++){
                if(cmp[i].equals(cmp[j])){
                    System.out.print(array[j]+" ");
                    array[j] = "123";
                }
            }
            System.out.println("dhatchu");
            System.out.println();
        }
    }
}
