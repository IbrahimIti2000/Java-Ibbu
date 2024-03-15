package bro;

public class Thread1 implements Runnable {
	
	public void run() {
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		Thread1 t=new Thread1();
		Thread y=new Thread(t);
		y.start();
		
	}

}
