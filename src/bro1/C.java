package bro1;

public class C extends Thread {
	static B b;
	int seat;

	public void run() {
		b.bookt(seat);
	}

	public static void main(String[] args) {
		
		b=new B();
		C c=new C();
		c.seat=7;
		c.start();
		
		C c1=new C();
		c1.seat=8;
		c1.start();
		
		b=new B();
		C c2=new C();
		c2.seat=9;
		c2.start();
		

	}

}
