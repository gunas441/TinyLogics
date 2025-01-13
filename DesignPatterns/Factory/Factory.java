package DesignPatterns.Factory;

public class Factory {
    public static void main(String[] args) {
       FactoryMethods fm = new FactoryMethods();
       OS obj = fm.getInstance("Closeds");
       obj.spec();
    }
}
