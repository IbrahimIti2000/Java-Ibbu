package bro;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LO {
	public static void main(String[] args) {

		List<String> l = Arrays.asList("Ibrahim", "ibbu", "ibbu", "India", "India");
List<Integer> asList = Arrays.asList(23,1900,65,89,546,98,989);
//	 List<String> collect = l.stream().distinct().limit(2).collect(Collectors.toList());
//		System.out.println(collect);
		
		Optional<Integer> min = asList.stream().max((v1,v2)->{return v1.compareTo(v2);});
		Optional<Integer> reduce = asList.stream().reduce((v1, v2)->{return v1+v2;});
		System.out.println(reduce.get());
		System.out.println(min.get());
	}

}
