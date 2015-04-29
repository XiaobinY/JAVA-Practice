package leetCode;

import java.util.HashMap;
import java.util.Set;

public class SingleNumber {
	public static int singleNumber2(int[] A) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		
		for(int i = 0; i < A.length; ++i){
			if(!hm.containsKey(A[i])){
				hm.put(A[i], 1);
			} else if (hm.get(A[i]) == 2){
				hm.remove(A[i]);
			} else {
				hm.put(A[i], hm.get(A[i]) + 1);
			}
		}
		
		Set<Integer> keys = hm.keySet();
		for(Integer key : keys){
			if(hm.get(key) == 1){
				return key;
			}
		}
		return -1;
    }
	
	public static int singleNumber(int[] A){
		int x = 0;
		for(int a : A){
			x = x ^ a;
		}
		return x;
	}
	
	public static void main(String[] args){
		int[] A = {1,2,6,1,2,4,6,4,3};
		
		System.out.println(singleNumber(A));
		
	}
}
