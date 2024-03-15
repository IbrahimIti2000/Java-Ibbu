package bro;

public class Notify extends Thread {
	int total;

	public void run() {

		synchronized (this) {
			for (int i = 0; i < 100; i++) {
				total++;
			}
			this.notify();

		}

	}

	public static void main(String[] args) throws InterruptedException {

		Notify n = new Notify();
		n.start();
		synchronized (n) {
			n.wait();
			System.out.println(n.total);
			
		}

	}

}
