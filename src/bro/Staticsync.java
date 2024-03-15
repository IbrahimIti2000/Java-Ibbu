package bro;

public class Staticsync extends Thread{
	public static void main(String[] args) {
		Book b = new Book();
		
		Myt t = new Myt(b, 7);
		t.start();

		Myt t1 = new Myt(b, 9);
		t1.start();

		Book b1 = new Book();
		Myt t2 = new Myt(b1, 10);
		t2.start();

	}

}

class Book {
	static int totals = 20;

	static synchronized void bookseat(int seat) {
		if (totals >= seat) {

			System.out.println("Seat Bokked" + seat);
			totals = totals - seat;
			System.out.println("Seats Left  " + totals);
		} else {

		}

	}
}

class Myt extends Thread {
	Book b;
	int seat;

	Myt(Book b, int seat) {
		this.seat = seat;
		this.b = b;

	}

	public void run() {
		b.bookseat(seat);
	}
}
