package bro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LIstA {
	public static void main(String[] args) {
		List<Integer> a = Arrays.asList(23, 45, 78, 90, 67);
		
//		Optional<Integer> max = a.stream().min((v1,v2)->{
//			
//			return v1.compareTo(v2);
//		});
//		long l = max.stream().count();
		Optional<Integer> r = a.stream().reduce((v,v1)->{
			return v+v1;
			
		});
//		System.out.println(max.get());
//		System.out.println(l);
		System.out.println(r.get());
		
		
	}

}
