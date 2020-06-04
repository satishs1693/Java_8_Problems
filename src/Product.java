
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Name == null) ? 0 : Name.hashCode());
		result = prime * result + id;
		result = prime * result + price;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (Name == null) {
			if (other.Name != null)
				return false;
		} else if (!Name.equals(other.Name))
			return false;
		if (id != other.id)
			return false;
		if (price != other.price)
			return false;
		return true;
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
