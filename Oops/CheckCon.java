package Oops;

class A{
    A(){
        System.out.println("A");
    }
    static void a(){
        System.out.println("a");
    }
}

class B extends A{
    B(){
        System.out.println("B");
    }
    static void b(){
        System.out.println("b");
    }
}

class C extends B{
    C(){
        System.out.println("C");
    }
    static void c(){
        System.out.println("c");
    }
}

public class CheckCon {
    public static void main(String[] args) {
        C cl = new C();

    }
}
