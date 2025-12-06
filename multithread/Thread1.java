
 class Thread1 extends Thread
 {
     @Override
     public void run()
     {
         System.out.println("hii");

     }

}
class test2
{
    public static void main(String[] args)
    {
       Thread1 t = new Thread1();
    }
}
