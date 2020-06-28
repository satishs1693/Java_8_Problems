package Algos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Highest_Value_in_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Integer> map = new HashMap<>();
		map.put("name1", 3);
		map.put("name2", 14);
		map.put("name3", 4);
		map.put("name4", 14);
		map.put("name5", 2);
		map.put("name6", 6);
		int max=Collections.max(map.values());
		List<String> lt = new ArrayList<String>();
		for ( Entry<String,Integer> entry :map.entrySet()) {
			if(entry.getValue()==max) {
				lt.add(entry.getKey());
			}
		}
		map.entrySet().stream().filter(entry->entry.getValue() == max)
		.map(entry->entry.getKey()).collect(Collectors.toList());
		
	}

}
