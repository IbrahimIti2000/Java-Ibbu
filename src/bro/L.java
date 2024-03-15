package bro;

public class L {
	public static void main(String[] args) {
		String i = "hbvd45h89013iuoo";
		String d = "", a = "";

		for (int j = 0; j < i.length() - 1; j++) {
			char y = i.charAt(j);
			if (Character.isAlphabetic(y)) {

				a += y;
			} else {
				d +=y;
			}
		}
		System.out.println(a+d);
	}

}
