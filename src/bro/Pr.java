package bro;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Producto {
	String name;
	String Cat;
	int pId;

	public Producto(String name, String cat, int pId) {
		super();
		this.name = name;
		Cat = cat;
		this.pId = pId;
	}

	public String getName() {
		return name;
	}

	public String getCat() {
		return Cat;
	}

	public int getpId() {
		return pId;
	}

}

public class Pr {
	public static void main(String[] args) {
		List<Producto> p = Arrays.asList(new Producto("Apple", "Fruits", 1), new Producto("Almond", "DryFruits", 2),
				new Producto("Milk", "DE", 3), new Producto("chille", "veg", 4), new Producto("salt", "De", 5),
				new Producto("Banana", "Fruits", 6));
		List<Producto> c = p.stream().filter(o -> o.getName().equals("salt")).collect(Collectors.toList());
		for (Producto h : c) {
			System.out.println(h.getCat());
			System.out.println(h.name);
			System.out.println(h.pId);
		}
	}

}
