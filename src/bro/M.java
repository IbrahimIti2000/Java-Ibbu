package bro;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class M {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<Integer> a = Arrays.asList(23, 45, 78, 90, 67);
		List<Integer> c = a.stream().map(o -> o + 18).filter(i -> i % 9 == 0).collect(Collectors.toList());
		System.out.println(c);
	}
}
