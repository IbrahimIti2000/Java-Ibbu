package bro1;

public class B {

	int total_t = 10;

	 void bookt(int n) {
		if (total_t > n) {
			System.out.println("Your Tickets Booked No  " + n);
			total_t = total_t - n;
			System.out.println("Remaing Tickets are  " + total_t);
		} else {
			System.out.println("Not Able to Book Tickets");
			System.out.println("Remaing Tickets are  " + total_t);
		}

	}

}
