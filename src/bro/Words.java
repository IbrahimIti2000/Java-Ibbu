package bro;

public class Words {
	public static void main(String[] args) {
		String str = "Hey Hello Welcome hey bro jh j kk";
		int cou = 1;
		String l="";
		//char h=' ';
		
		for (int i = 1; i < str.length(); i++) {
			if ((str.charAt(i) == ' ') && (str.charAt(i+1) !=' ')) {
				cou++;
				//l=l+str.charAt(i);
				
			}

		}
		System.out.println(cou);
		
	}

}
