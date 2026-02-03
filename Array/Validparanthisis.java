package Array;

public class Validparanthisis {
    public static void main(String[] args) {
        String s ="{[(]}";
        System.out.println(s+" -> "+validpara(s));
    }
    
    // Replace and Contains
    private static boolean valid2(String str) {
        while (true){
            if(str.contains("{}")){
                str=str.replace("{}","");
            } else if (str.contains("()")){
                str=str.replace("()","");
            } else if (str.contains("[]")){
                str=str.replace("[]","");
            }else {
                return str.isEmpty();
            }
        }
    }

    // Using stack 
    private static boolean valid(String str) {
        Stack<Character> stack = new Stack<>();
        for (Character ch:str.toCharArray()){
            if(ch == '{' || ch == '[' || ch == '('){
                stack.push(ch);
            }else if(ch == '}' || ch == ']' || ch == ')'){
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                if(ch=='}' && top!='{' && ch==']' && top!='[' && ch==')' && top!='('){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
