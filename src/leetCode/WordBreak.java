package leetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak {
	public static boolean wordBreak(String s, Set<String> dict){
		System.out.println("s = " + s);	
		if(s == null) return false;
		if(s.length() == 0 || dict.contains(s)) return true;
		
		List<Integer> l = new ArrayList<>();
		for(String d: dict){
			l.add(d.length());
		}
		Collections.sort(l);
		Collections.reverse(l);
		
		for(int i: l){
			boolean curResult = false;
			if(i <= s.length()){
				String cur = s.substring(0, i);
				if(dict.contains(cur)){
					System.out.println("cur = " + cur);
					curResult =  wordBreak(s.substring(i, s.length()), dict);
				}
				if(curResult) return true; 
			}
		}		
		return false;
	}
	
	public static void main(String[] args){
		String s = "leetcode";
		Set<String> dict = new HashSet<>();
		dict.add("leet");
		dict.add("code");
		
		System.out.println(wordBreak(s, dict));	
		
		String s2 = "aaaaaaa";
		Set<String> dict2 = new HashSet<>();
		dict2.add("aaaa");
		dict2.add("aaa");

		System.out.println(wordBreak(s2, dict2));	
		
		String s3 = "goalspecial";
		Set<String> dict3 = new HashSet<>();
		dict3.add("go");
		dict3.add("goal");
		dict3.add("goals");
		dict3.add("special");


		System.out.println(wordBreak(s3, dict3));	
	}
}
