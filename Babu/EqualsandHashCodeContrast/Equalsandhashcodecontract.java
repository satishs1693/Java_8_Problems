package EqualsandHashCodeContrast;

import java.util.HashMap;
import java.util.Map;

/*

In Java if two Object are equal accoding to equals() methoed  only they must have same hashcode .
If two Object have same hash code and equlas methoed return true then only we say two object are equal.

In java there is contarct that if we Overite equals we should overwrite the hashcode also .

if we brake this contract then we will face some error consequences when we use that class in the Hash based collections .See the below examples

*******
   we have equlas methoed for comparision but why we have hashcode methoed 
   Its purley for the hash searching efficency
   what do you mean that 
   If we have 1000 Object in collection then Every time we con't go and compare the 1000 objects with key by using equlas .
   Here by using hash code we can by pass 900 Objects remaining are the 100 Objects which are need to compare using equals .
   hashcode function is purley for the Efficient search operation only.
   
   If you are using custom Obect as HashMap Key then Use We Should override both equals and hash code 
   
   Below First with out hash code i did the operation. After that i used the IDE Genrated Hashcode.
   
*/
public class Equalsandhashcodecontract {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map mp = new HashMap<>();
		CustomerID cid= new CustomerID(234, 0);
		System.out.println(cid.hashCode());
		mp.put(cid, "SatishTokala");
		System.out.println(mp.get(new CustomerID(234, 0)));
	}
}
class CustomerID{
	private int crmID;
	private int nameSpace;
	public CustomerID(int crmID, int nameSpace) {
		super();
		this.crmID = crmID;
		this.nameSpace = nameSpace;
	}
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof CustomerID)) return false;
		if(obj==this) return true;
		CustomerID obj1=(CustomerID)obj;
		return this.crmID==obj1.crmID && this.nameSpace==obj1.nameSpace;
	}
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + crmID;
		result = prime * result + nameSpace;
		return result;
	}
}