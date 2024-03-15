package bro1;

class V{
	int a=20;
	String s="Ibbu";
	public void display() {
		System.out.println(a);
		System.out.println(s);
	}
}

class K extends V{
	
	int a=30;
	String s="Ibrahim";
	public void display() {
		System.out.println(a);
		System.out.println(s);
	}
	
	
	
}

public class J {
	public static void main(String[] args) {
		V v=new K();
		v.display();
		
	}
	

}
