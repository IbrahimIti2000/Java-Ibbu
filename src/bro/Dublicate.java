package bro;

public class Dublicate {
	public static void main(String[] args) {
		String s = "Hey I am Ibrahim";
		String[] s1 = s.trim().split(" ");
		String n = " ";
		for (String string : s1) {
			for (int i = string.length() - 1; i >= 0; i--) {
				System.out.print(string.charAt(i));

			}

			
		}
	}

}
