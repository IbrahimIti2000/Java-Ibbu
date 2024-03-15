package bro;

public class Hello {
	public static void main(String[] args) throws InterruptedException {
		Thread t=new Thread((Runnable) new Myrunnable());
		t.start();
		System.out.println(Thread.currentThread().getState());
		
		
		
		System.out.println(Thread.currentThread().getState());
		
		Thread.sleep(1000);
		System.out.println(Thread.currentThread().getState());
		
		System.out.println(Thread.currentThread().getState());
		
		}
	
	
	
	static class Myrunnable{
		public void run() {
			System.out.println("I am rum");
			System.out.println(Thread.currentThread().getState());
		}
	}

}
