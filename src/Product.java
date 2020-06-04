
public class Product {
	public int id;
	public String Name;
	public int price;
	
	public Product(int id, String name, int price) {
		super();
		this.id = id;
		Name = name;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", Name=" + Name + ", price=" + price + "]";
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
