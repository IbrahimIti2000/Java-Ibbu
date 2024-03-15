package bro;

public class Dig {
	public static void main(String[] args) {
		int num = 56734698;
		int en = 0;
		int on = 0;
		while (num > 0) {
			int rem = num % 10;
			if (rem % 2 == 0) {
				en++;
			} else {
				on++;
			}
			num=num/10;

		}
		System.out.println(en + "  " + on);
		System.out.println("hello");
	}

}
