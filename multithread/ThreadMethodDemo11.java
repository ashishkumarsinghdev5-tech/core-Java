package multiThread;

class ThreadMethodDemo11 extends Thread
{
    public void run() {
        try {
            for (int i = 1; i < 10; i++) {
                System.out.println(i +":" +Thread.currentThread().getName() );
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);

        }

    }

    public static void main(String[] args) {
        ThreadMethodDemo t = new ThreadMethodDemo();
        t.start();
        try {
            for (int i = 1; i < 10; i++) {
                System.out.println(i +":" +Thread.currentThread().getName() );
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);

        }

    }
}
