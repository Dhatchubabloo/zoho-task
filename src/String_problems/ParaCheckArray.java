package l2_programs;

public class ParaCheckArray {
    public static void main(String[] args) {
        String str = "(){}[[]]({)}]";
        char array[] = str.toCharArray();
        String temp = "";
        int count = 0;
        for(int i=0;i< array.length;i++){
                if (array[i] == '(' || array[i] == '[' || array[i] == '{')
                    temp += array[i];
                else if (array[i] == ']' || array[i] == '}' || array[i] == ')') {
                    int len = temp.length() - 1;
                    if (len < 0) {
                        count++;
                        break;
                    } else {
                        if (array[i] == ')') {
                            if (temp.charAt(len) != '(') {
                                count++;
                                break;
                            }
                        } else if (array[i] == ']') {
                            if (temp.charAt(len) != '[') {
                                count++;
                                break;
                            }
                        } else if (array[i] == '}') {
                            if (temp.charAt(len) != '{') {
                                count++;
                                break;
                            }
                        }
                        temp = new ParaCheckArray().remove(temp);
                    }
                }
            }
        if(count==0)
            System.out.println("Balanced");
        else
            System.out.println("Not Balanced");
    }
    String remove(String str){
        String temp = "";
        for(int i=0;i<str.length()-1;i++){
            temp+=str.charAt(i);
        }
        return temp;
    }
}
