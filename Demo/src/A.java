public class A {
        static int x = 10;
        int y = 20;
        public static void main(String[] args){
            int x = 10;
            A a1 = new A();
            System.out.println(a1.y);
            System.out.println(A.x);
            System.out.println(x);

        }
    }
