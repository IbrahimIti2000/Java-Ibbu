package bro;



public class Arrayaa {
	public static void main(String[] args) {
		
		
		double[] a= {10.34,89.76,56.90,78.22,12.34};
		double[] b=new double[a.length];
		long[] c=new long[a.length];
		
		
		for (int i = 0; i < a.length; i++) {
			c[i]=(long) a[i];
			b[i]=a[i]-c[i];
			System.out.println(c[i]+"  "+b[i]);
			
		}
		
	}

}
