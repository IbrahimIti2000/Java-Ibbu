package bro;

public class REverse {
public static void main(String[] args) {
	int num=12345;
	int rev=0;//0
	while(num!=0) {
		rev=rev*10+num%10;//0+5 50+4 5540
		num=num/10;//1234 123
	}
	System.out.println(rev);
}
}
