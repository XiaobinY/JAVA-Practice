package leetCode;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatChar {
	public static int lengthOfLongestSubstring2(String str) {
	       int max = 0;
			HashMap<Character, Boolean> hm = new HashMap<>(); 
			
			for(int i = 0; i < str.length(); ++i){
				hm.clear();
				int j = i;
				
				while(j < str.length()){
					if(hm.containsKey(str.charAt(j))) break;
					hm.put(str.charAt(j), true);
					j++;
				}
				
				if(j - i > max){
					max = j - i;
				}
			}
			return max; 
	    }
	
	public static int lengthOfLongestSubstring(String str){
		int max = 0;
		int head = 0;
		Integer[] list = new Integer[256];
		
		for (int tail = 0; tail < str.length(); ++tail){
			int index = str.charAt(tail);
			
			if(list[index] == null){
				list[index] = tail;
				if(tail - head + 1 > max) max = tail - head + 1;
			} else {
				
				for(int i = head; i < list[index]; ++i){
					list[str.charAt(i)] = null;
				}
				
				head = list[index] + 1;
				list[index] = tail;
			}
		}
		return max;
	}
	
	public static void main(String[] args){
		String a = "aabcxcda";
		String b = "tmmzuxt";
		String c = "aaaaa";
		
		System.out.println(lengthOfLongestSubstring(b));
	}
}
