package AnonymousClassExample; // Anonymous Class example
 class  MyRunnable implements Runnable
 {
     @Override
     public void run()
     {
         System.out.println("Thread running..........");
         System.out.println("i am so happy");
     }
 }
public class RunnableDemo1
{
    public static void main(String[] args)
    {
       Runnable r = new MyRunnable();
       new Thread(r).start();
        System.out.println("My name is ashish");
    }
}
