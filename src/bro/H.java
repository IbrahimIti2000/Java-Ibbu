package bro;

public class H {
	public static void main(String[] args) {
		String w="Hey HEllo I am Ibrahim";
		String w1="";String m="";
		for (int i = 0; i <w.length()-1; i++) {
			char c = w.charAt(i);
			if (c!=' ') {
				w1=w1+c;
				
			}else {
				
				w="";
			}
			System.out.println(w);
			
		}
		
	}

}
