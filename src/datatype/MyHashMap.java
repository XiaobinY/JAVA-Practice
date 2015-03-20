package datatype;

import java.util.*;

public class MyHashMap {
	
	public static void main(String[] argu){
		// Initialize
		HashMap<String, Integer> hm = new HashMap<>();
		
		// put and get
		hm.put("Xiaobin", 1);
		hm.put("Xiaoye", 2);
		hm.put("Xiaorouyuan", 3);
		
		int xb = hm.get("Xiaobin");
		int xy = hm.get("Xiaoye");

		System.out.println(xy);
		System.out.println(xb);
		
		
		// keySet
		Set<String> keys = hm.keySet();
		
		for(String key : keys){
			System.out.println(key);
		}	
		
		// value
		Collection<Integer> values = hm.values();
		
		for ( Integer value : values){
			System.out.println(value);
		}
		
		// clear and clone
		
	}	
}
