package bro;

public class Reg {
	public static void main(String[] args) {
		String s="s@@!#$%rue89nj90oewjokre9671$#%^&*((";
		String r = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(r);
	}

}
