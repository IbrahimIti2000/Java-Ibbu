package bro;

import java.nio.file.spi.FileSystemProvider;

public class Tg extends Thread {
	static Thread currentThread; 
	public static void main(String[] args) throws InterruptedException {
		currentThread=Thread.currentThread();
		Tg t=new Tg();
		t.start();
		t.interrupt();
		
		
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			
		}

	}

	public void run() {
		Thread.interrupted();
		Thread.currentThread().isInterrupted();
for (int i = 0; i <=5; i++) {
	
	try {
		System.out.println(i);
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
    
	}

}
