package bai_3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class main {
	public Set<String> categories = new HashSet<String>(Arrays.asList("Electronics","Furniture","Electronics", "Books", "Clothing", "Books"));
	Map<Integer, Product> productMap = new HashMap<>();
		
	public static void addProduct (List<Product> products) {
		products.add(new Product(121, "Thit ga", 25));
		products.add(new Product(122, "Ca rot", 100));
		products.add(new Product(123, "Rau má", 100));
		products.add(new Product(124, "Thit bo", 50));
		products.add(new Product(125, "Muoi", 23));
	}
	
	public static void printProduct (List<Product> products) {
		products.stream().forEach(System.out::println);
	}
	
	public static void gialonhon100 (List<Product> products) {
		products.stream().filter(p -> p.getPrice() >= 100).forEach(System.out::println);
	}
	
	public static void laygialonnhat (List<Product> products) {
		Product maxProduct = products.stream().max(Comparator.comparing(p -> p.name)).orElse(null);
		System.out.println(maxProduct);
	}
	public boolean kiemtra(Set<String> categories) {
		return categories.contains("Electronics");
	}
	public Set<String> xoasach(Set<String> categories) {
		categories.remove("Books");
		return categories;
	}
	public int demsoluong (Set<String> categories) {
		return categories.size();
	}
	public static void main (String[] args) {
		List<Product> cuahang = new ArrayList<Product>();
		addProduct(cuahang);
		System.out.println("Ten cac loai hang: ");
		printProduct(cuahang);
		System.out.println("Loai hang lon hon 100: ");
		gialonhon100(cuahang);
		System.out.println("Gia lon nhat cua cac loai hang: ");
		laygialonnhat(cuahang);
	}
}


