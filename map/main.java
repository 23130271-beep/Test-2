package map;

import java.util.HashMap;
import java.util.Map;

public class main {
	public static void main(String[] args) {
        Map<Integer, Product> productMap = new HashMap<>();
        
        productMap.put(1, new Product(1, "Laptop"));
        productMap.put(2, new Product(2, "Mouse"));
        productMap.put(3, new Product(3, "Keyboard"));
        productMap.put(4, new Product(4, "Monitor"));
        productMap.put(5, new Product(5, "Headphone"));
        productMap.put(3, new Product(6, "Core"));

        System.out.println("Cau 1: ");
        printProducts(productMap);
        System.out.println("Cau 2: ");
        System.out.println(findProductById(productMap, 2));
        System.out.println("Cau 3: ");
        System.out.println(checkProductId3(productMap));
    }
	public static Product findProductById(Map<Integer, Product> productMap, int id) {
        return productMap.get(id);
    }

    public static void printProducts(Map<Integer, Product> productMap) {
        productMap.keySet().forEach(System.out::println);
    }

    public static boolean checkProductId3(Map<Integer, Product> productMap) {
        return productMap.containsKey(3);
    }
    
}
