import java.util.concurrent.ConcurrentHashMap; 
import java.util.Iterator; 
public class FailSafeIterator_CurrentHashMap {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ConcurrentHashMap<String,String> cityCaptials = new ConcurrentHashMap<String,String>();
		 ConcurrentHashMap<String, String> map 
         = new ConcurrentHashMap<String, String>(); 
		 map.put("India","Delhi");
		 map.put("USA","Washington");
		 map.put("Aus","Berra");
		 map.put("Srilanka","Columbo");
		 Iterator it = map.keySet().iterator();
		 map.put("Canada","DontNO");	
		while(it.hasNext()) {
			String st =(String)it.next();
			System.out.println(map.get(st));
			
		}
	}
}
