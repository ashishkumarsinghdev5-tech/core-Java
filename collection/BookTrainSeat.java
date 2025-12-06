

public class BookTrainSeat {

    int total_seats = 10;

    public synchronized void bookSeat(int seats) { // SYNCHRONIZED METHOD
        if (total_seats >= seats) {
            System.out.println(Thread.currentThread().getName() + " booked " + seats + " seat(s)");
            total_seats = total_seats - seats;
            System.out.println("Seats left: " + total_seats);
        } else {
            System.err.println(Thread.currentThread().getName() + " failed to book " + seats + " seat(s)");
            System.err.println("Only " + total_seats + " seat(s) left");
        }
    }

    // ✅ INNER THREAD CLASS
    class MyThread extends Thread {
        BookTrainSeat bts;
        int seats;

        MyThread(BookTrainSeat bts, int seats, String name) {
            this.bts = bts;
            this.seats = seats;
            this.setName(name);
        }

        public void run() {
            bts.bookSeat(seats);
        }
    }

    // ✅ MAIN METHOD INSIDE SAME FILE
    public static void main(String[] args) {

        BookTrainSeat bts = new BookTrainSeat();

        BookTrainSeat.MyThread t1 = bts.new MyThread(bts, 5, "Ashish");
        BookTrainSeat.MyThread t2 = bts.new MyThread(bts, 6, "Amit");
        BookTrainSeat.MyThread t3 = bts.new MyThread(bts, 4, "Rahul");

        t1.start();
        t2.start();
        t3.start();
    }
}
