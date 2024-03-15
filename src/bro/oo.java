package bro;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class oo {
	public static void main(String[] args) {
//		System.out.println("Write Your Text");
//		Scanner sc=new Scanner(System.in);
//		String str = sc.next();
		String str = "Hello Bro I Am Ibrahim ii ii hello";

//		String[] split = str.toUpperCase().trim().split(" ");
//		Map<String, Long> collect = Arrays.stream(str.toLowerCase().trim().split(""))
//				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//		System.out.println(collect);

//		Map<String, Long> collect = Arrays.stream(str.toUpperCase().trim().split(""))
//				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//		Stream<String> stream = Arrays.stream(str.split(""));

		Map<String, Long> collect2 = Arrays.stream(str.split("")).map(y -> y.toUpperCase()).filter(e -> !e.isBlank())
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(collect2);

//		Map<String, Long> collect2 = stream.map(o->o.toUpperCase()).filter(i -> !i.isBlank())
//				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//
//		System.out.println(collect2);

	}

}
