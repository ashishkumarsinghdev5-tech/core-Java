

 class IsInterruptedThread4 extends  Thread
{
    public void run()
    {
        System.out.println("is thread interrupted (1):"+ Thread.interrupted());
        System.out.println("is thread interrupted (2):"+ Thread.interrupted());

        System.out.println("is thread interrupted (1):"+ Thread.currentThread().isInterrupted());
        System.out.println("is thread interrupted (2):"+ Thread.currentThread().isInterrupted());
    }

    public static void main(String[] args)
    {
        IsInterruptedThread4 t = new IsInterruptedThread4();
        t.start();
    }
}
