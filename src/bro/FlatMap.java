package bro;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FlatMap {
	public static void main(String[] args) {
		List<String> s = Arrays.asList("Ibrahim", "Ibbu", "Hello");
		List<String> s1 = Arrays.asList("Yaseen", "iKhan", "Jaheer");
		List<String> s2 = Arrays.asList("Anil", "Vinay", "iPrakash");
		List<List<String>> s4 = Arrays.asList(s, s1, s2);
//		List<String> C = s4.stream().flatMap(o -> o.stream().filter(u -> u.startsWith("I"))).map(p -> p + "Iti").filter(y->y.length()<=7)
//				.collect(Collectors.toList());
		boolean d = s.stream().anyMatch(o->{return o.startsWith("I");});
		System.out.println(d);
		Optional<String> f = s.stream().findAny();
		System.out.println(f.get());
	
	}

}
