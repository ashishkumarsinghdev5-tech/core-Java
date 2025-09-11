import java.util.Stack;
public class demo3
{
    public static void main(String[] args)
    {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s);
        System.out.println(s.peek()); // top element
        System.out.println(s.pop()); // remove top element and return
        System.out.println(s);
    }
}
