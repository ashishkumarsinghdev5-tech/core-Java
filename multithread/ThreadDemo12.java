package multiThread;

class ThreadDemo12 extends Thread // take admission
{
    public void run()
    {
        try
        {
            System.out.println("Admission start");
            Thread.sleep(5000);
            System.out.println("You have taken the admission successfully");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    class DepositFee extends Thread
    {
        public void run() {
            try {
                System.out.println("Depositing fees");
                Thread.sleep(1000);
                System.out.println("You have deposited successfully");
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    class TakeRollno extends Thread
    {
        public void run() {
            try {
                System.out.println("Take roll no");
                Thread.sleep(2000);
                System.out.println("You have enrolled roll no successfully");
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException
    {
        ThreadDemo12 t = new ThreadDemo12();
        t.start();

        ThreadDemo12.DepositFee t2 = t.new DepositFee(); // notice t.new
        t2.start();

        ThreadDemo12.TakeRollno t3 = t.new TakeRollno(); // notice t.new
        t3.start();

        // optional: wait for all to finish
        t.join();
        t2.join();
        t3.join();

        System.out.println("All threads finished.");
    }
}
