import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Streamdemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> lt = new ArrayList<Product>();
		lt.add(new Product(1, "Mobile1233333", 100000));
		lt.add(new Product(2, "TV", 3000));
		lt.add(new Product(3, "Mobile1", 400007));
		lt.add(new Product(3, "Mobile1", 400007));
		Set<Product> lt1=lt.stream().map(p->p).distinct().collect(Collectors.toSet());
		System.out.println("Outttttttttt"+lt1.toString());
		System.out.println("Outttttttttt"+lt1.toString());
		Map<Integer, String> sorted_list = lt1.stream().collect(Collectors.toMap(product->product.getPrice(), product->product.getName()));
		String longeststring = lt.stream().filter(product -> product.getPrice() > 150)
				.map(price -> price.getName()).reduce((str1, str2) -> str1.length() > str2.length() ? str1 : str2)
				.orElse("Satish");
		System.out.println(longeststring.length());
		Product pt = lt.stream().max((p1, p2) -> p1.getPrice() - p2.getPrice()).orElse(new Product(102, "Batt", 5000));
		System.out.println(pt.getName());
		System.out.println("*****************************");
		System.out.println(sorted_list.toString());
	}
}
