package bro;

import java.util.Iterator;

public class S {
	public static void main(String[] args) {
		String w = "Hey HEllo I am Ibrahim";
		String[] s = w.split(" ");
		String R = "";
		String Rev = "";
		for (String s1 : s) {
			for (int i = s1.length() - 1; i >= 0; i--) {
				Rev = Rev + s1.charAt(i);
			}
		}
		R = R + Rev + " ";
		System.out.println(R);
	}
}
