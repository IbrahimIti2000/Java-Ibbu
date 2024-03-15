package bro;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Product {
	private int id;
	private String name;
	private String cat;
	private Addre ads;

	public Product(int id, String name, String cat, Addre ads) {
		super();
		this.id = id;
		this.name = name;
		this.cat = cat;
		this.ads = ads;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCat() {
		return cat;
	}

	public void setCat(String cat) {
		this.cat = cat;
	}

	public Addre getAds() {
		return ads;
	}

	public void setAds(Addre ads) {
		this.ads = ads;
	}

}

public class Pro {
	public static void main(String[] args) {
		List<Product> s = Arrays.asList(new Product(1, "boat", "ele", new Addre(1, "Iti Oni Gadag")),
				new Product(2, "Veg", "potato", new Addre(2, "Hubli")),
				new Product(3, "boat", "HeadPhone", new Addre(3, "Davangere")),
				new Product(4, "Fruits", "Banana", new Addre(4, "Bengluru")),
				new Product(5, "Fruits", "Apple", new Addre(5, "Haveri")),
				new Product(6, "DE", "milk", new Addre(6, "Belgavi"))

		);

//		List<Product> c = s.stream().filter(o -> o.getCat() == "ele").collect(Collectors.toList());
		

	}

}
