package bro;

public class ArraySum {
	public static void main(String[] args) {
		int[] num = { 2, 4, 6, 3, 8, 9, 8 ,100,253};
		int sum = 0;
		int max =num[0];
		int min = num[0];
		for (int i = 0; i < num.length; i++) {
			if (num[i]>max) {
				max = num[i];
			}
			if (num[i]<min) {
				min = num[i];
			}
			
		}
		System.out.println(max+"  "+min);
	}

}
