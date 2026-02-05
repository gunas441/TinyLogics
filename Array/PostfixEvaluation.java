import java.util.Stack;

public class PostfixEvaluation {
    public static void main(String[] args) {
        String pro = "231*+9-";
        int ans = checkAns(pro);
        System.out.println(ans);
    }

    private static int checkAns(String pro) {
        Stack<Integer> stack = new Stack<>();
        for (char c:pro.toCharArray()){
            if(Character.isDigit(c)){
                stack.push(c - '0');
            }else {
                int a = stack.pop();
                int b = stack.pop();
                switch (c){
                    case '+':stack.push(a+b);
                    break;
                    case '-':stack.push(a-b);
                    break;
                    case '*':stack.push(a*b);
                    break;
                    case '/':stack.push(a/b);
                    break;
                }
            }
        }
        return stack.pop();
    }
}
