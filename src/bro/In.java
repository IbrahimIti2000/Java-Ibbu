package bro;

public class In {
	public static void main(String[] args) {
		int[] a = { 10, 20, 56, 78,100, 120 };
		int key = 9000;
		int l = 0;
		int h = a.length - 1;
		while (l <= h) {
			int m = (l + h) / 2;
			if (a[m] == key) {
				System.out.println("Element Found");
				break;

			}
			if (a[m] > key) {
				h = m - 1;
System.out.println(m);
			}
			if (a[m] < key) {
				l = m + 1;

			}

		}
	}

}
