package bro;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class St {public static void main(String[] args) {
	

	Integer[] i= {90,67,45,78,34,78};
	List<Integer> n=Arrays.asList(i);
	n.stream().sorted(Comparator.reverseOrder()).skip(6).limit(1).forEach(j->System.out.println(j));
	
}
}
