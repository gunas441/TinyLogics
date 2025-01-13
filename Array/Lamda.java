package Array;


public class Lamda {
    interface A{
        void show();
        int say();
        default void when(){
            System.out.println("I am when");
        }
        static void was(){
            System.out.println("I am was");
        }
    }
    interface B extends A{

        default void when(){
            System.out.println("I am when2");
        }
    }

      static class C implements A,B {

        @Override
        public void show() {
            System.out.println("Hi");
        }

        @Override
        public void when(){
            System.out.println("Hello Guna..");
        }

        @Override
        public int say() {
            return 1;
        }
    }

    public static void main(String[] args) {
       A obj = new C();
//       obj.show();
//       System.out.println(obj.say());
       obj.when();



//        List<Integer> list = Arrays.asList(2,1,3);
//        list.sort(Integer::compareTo);
//        list.forEach(a-> System.out.print(a+" "));
//        A obj = String::equals;
//        System.out.println(obj.add("a","a"));

    }
}
