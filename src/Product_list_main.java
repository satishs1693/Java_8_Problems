import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Product_list_main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> lt = new ArrayList<Product>();
		lt.add(new Product(1, "Mobile1233333", 1000)); lt.add(new Product(2, "TV",
		3000)); lt.add(new Product(3, "Mobile ", 4000));
		
		List<Product> sorted_list =lt.stream().filter(product->product.getPrice() > 900).collect(Collectors.toList());
		String longeststring =sorted_list.stream()
				.filter(product->product.getPrice() > 150)
				.map(price->price.getName())
				.reduce(String :: concat)
				.orElse("Satish");
		System.out.println(longeststring);
		
		}
}
 