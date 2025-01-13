package DesignPatterns.Factory;

public class FactoryMethods {
    public OS getInstance(String str){
        if(str.equals("Open")){
            return new Android();
        }else if(str.equals("Closed")){
            return new Ios();
        }else {
            return new Windows();
        }
    }
}
