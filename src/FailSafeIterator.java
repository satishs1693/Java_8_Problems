import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		CopyOnWriteArrayList<String > copyOnWriteArrayList= new CopyOnWriteArrayList<String>();
		copyOnWriteArrayList.add("Satish");
		copyOnWriteArrayList.add("Tokal");
		copyOnWriteArrayList.add("Kumar");
		copyOnWriteArrayList.add("Ragesh");
		Iterator it = copyOnWriteArrayList.iterator();
		System.out.println();
		while(it.hasNext()) {
			
			Object ob = it.next();
			System.out.println(ob);
			if(ob.equals("Kumar")) {
				int index = copyOnWriteArrayList.indexOf("Kumar");
				// It will not include while printing .Because it is copy of Array 
				copyOnWriteArrayList.set(index, "Raaaaaaaaaaa");
			}	
		}
		//System.out.println(copyOnWriteArrayList);
		}

}
