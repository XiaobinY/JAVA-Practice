package sandBox;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class ListIntersection {
	public static List<Integer> listInter(List<Integer> a, List<Integer> b){
		List<Integer> result = new ArrayList<>();
		if(a == null || b == null || a.size() == 0 || b.size() == 0) return result;
		
		HashMap<Integer, Boolean> hm = new HashMap<>();
		
		for(int i = 0; i < a.size(); ++i){
			hm.put(a.get(i), true);
		}
		
		for(int i = 0; i < b.size(); ++i){
			if(hm.containsKey(b.get(i))){
				result.add(b.get(i));
			}
		}
		return result;
	}
	
	public static void main(String[] args){
		List<Integer> a = new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		
		List<Integer> b = new ArrayList<>();
		b.add(3);
		b.add(4);
		b.add(5);
		b.add(6);
		b.add(7);
		b.add(8);
		
		System.out.println(listInter(a, b).toString());
	}
}
