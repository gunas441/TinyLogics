package Array;

public class Validparanthisis {
    public static void main(String[] args) {
        String s ="{[(]}";
        System.out.println(s+" -> "+validpara(s));
    }

    private static boolean validpara(String s) {
        while (true){
            if(s.contains("{}")){
                s=s.replace("{}","");
            }  else if(s.contains("()")){
                s=s.replace("()","");
            }  else if(s.contains("[]")){
                s=s.replace("[]","");
            }else {
                return s.isEmpty();
            }
        }
    }
}
