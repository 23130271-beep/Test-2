package map;

public class Product {
	private int id;
	private String name;
	public Product(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public String toString() {
        return id + " - " + name;
    }
}
