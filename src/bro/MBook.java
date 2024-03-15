package bro;

public class MBook extends Thread {
	int seat;
	static bookSeat b;

	public void run() {
		
		
		b.bookseat(seat);

	}
	
	public static void main(String[] args) {
		b=new bookSeat();
		
		MBook m=new MBook();
		m.seat=7;
		m.start();
		
		
		MBook b=new MBook();
		b.seat=8;
		b.start();
		
		
		
		
		
		
		
	}

}
