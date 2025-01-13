package String;

public class printPermutn {
    public static void main(String[] args) {
      String input = "abc";
      String output = "";
      printpermun(input,output);
    }

    private static void printpermun(String input, String output) {
        if(input.isEmpty()){
            System.out.println(output);
        }
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            String per = input.substring(0,i)+input.substring(i+1);
            printpermun(per,output+ch);
        }
    }


}
