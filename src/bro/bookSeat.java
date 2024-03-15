package bro;

public class bookSeat {
	int total_seat = 10;

	void bookseat(int seat) {
		synchronized (this) {
			if (seat <= total_seat) {
				System.out.println("Seat booked  " + seat);
				total_seat = total_seat - seat;
				System.out.println("Left Seats  " + total_seat);

			} else {
				System.out.println("Left Seats  " + total_seat);
			}
		}
	}

}
