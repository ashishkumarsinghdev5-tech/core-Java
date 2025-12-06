//package multiThread;
class BookTicket1{
    int total_seat=100;
  private void BookTicket1(int seat)
    {
        if(total_seat>=seat)
        {
            System.out.println("success");
            total_seat=total_seat-seat;
            System.out.println("seat left :" +total_seat);
        }else
        {
            System.out.println("fail");
        }
    }
}
class Locked extends Thread {
    BookTicket bt;
    int seat;

    Locked(BookTicket bt, int seat) {
        this.bt = bt;
        this.seat = seat;
    }

    public void run() {
        BookTicket1 b1 = new BookTicket1();
    }

    public class LockedInterface {

    }
}
