package Overriding;

public class Classb extends ClassA {
    void show(int a)
    {
        System.out.println(a);
    }


    public static void main(String[] args) {
        ClassA ob3 = new ClassA();
        ob3.show(20);
    }
}
