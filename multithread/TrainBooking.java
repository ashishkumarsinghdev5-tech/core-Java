//package multiThread;
class BookTicket
{
    int Total_seats=10;
     void bookTicket(int seats)
    {
      if(Total_seats>=seats)
      {
          System.out.println("Success");
         // System.out.println(Thread.currentThread().getName() + " booked " + seats  );
          Total_seats= Total_seats-seats;
          System.out.println("seats left :" +Total_seats);
      }
      else
      {
          //System.err.println(Thread.currentThread().getName() + " failed to book " + seats );
          System.err.println("Fail");
      }
    }

}
class Synchronization extends Thread
{
    String name ;
    BookTicket bt;
    int seats ;
    public Synchronization(BookTicket bt,int seats,String name )
    {
        this.bt=bt;
        this.seats=seats;
        this.setName(name); ;
    }
    public void run()
    {
     bt.bookTicket(10);
    }

}

public class TrainBooking
{
    public static void main(String[] args)
    {
        BookTicket bt= new BookTicket();
        Synchronization t = new Synchronization(bt,3,"Ashish");
         t.start();
        Synchronization t1 = new Synchronization(bt,4,"Amit");
        t1.start();
        Synchronization t2 = new Synchronization(bt,3,"Ankit");
        t2.start();
    }
}
