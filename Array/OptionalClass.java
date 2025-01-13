package Array;

import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args) {
        String[] w = new String[10];
        Optional<String> op = Optional.of(w[6]);
        if(op.isPresent()){
            String text = w[5];
            System.out.println(text);
        }else {
            System.out.println("Not Present");
        }
    }
}
