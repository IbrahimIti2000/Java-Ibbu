package bro;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class For {
	public static void main(String[] args) {
		List<String> s = Arrays.asList("Ibrahim", "Ibbu", "Hello");
		List<String> c = s.stream().distinct().collect(Collectors.toList());
		System.out.println(c);
	}

}
