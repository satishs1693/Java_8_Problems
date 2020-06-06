import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FastFailIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String > cityCaptials = new HashMap<String,String>();
		cityCaptials.put("India","Delhi");
		cityCaptials.put("USA","Washington");
		cityCaptials.put("Aus","Berra");
		cityCaptials.put("Srilanka","Columbo");
		Iterator<String> it = cityCaptials.keySet().iterator();
		while(it.hasNext()) {
			System.out.println(cityCaptials.get(it.next()));
			cityCaptials.put("Sat", "Ragesh");
		}

	}

}
