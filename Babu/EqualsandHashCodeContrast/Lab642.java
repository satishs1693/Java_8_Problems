package EqualsandHashCodeContrast;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Lab642 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map map = new HashMap<>();
		map.put("satish", "Tokala");
		map.put("Mani","Pottu");
		map.put("Raja", "Kuja");
		map.put("satish", "TTTT");
		System.out.println(map.get("satish"));		
		
		
		Set st = new HashSet<>();
		st.add("satish");
		st.add("satish");
		st.add("satish");
		
		System.out.println(st.toString());
		
		
	}

}
