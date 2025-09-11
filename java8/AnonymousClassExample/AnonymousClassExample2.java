package AnonymousClassExample;

public class AnonymousClassExample2
{
    public static void main(String[] args)
    {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("thread running using anonymous class....");
            }
        };
        new Thread(r).start();
    }
}
