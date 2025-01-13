package Exception;

class GunaException extends Exception{
    public GunaException(String str){
        super(str);
    }

}

public class UserDefine {
    public static void main(String[] args) {
        try {
            int k = 0/10;
            if(k==0){
                throw new GunaException("I don't want zero");
            }
        }catch (GunaException e){
            System.out.println(e.getMessage());
        }
    }
}
