package leetCode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
	public static int[] twoSum(int[] numbers, int target) {
		int[] result = new int[2];
	    if(numbers.length <= 2) return result;
	    
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(int i = 0; i < numbers.length; ++i){
			hm.put(numbers[i], i + 1);
		}
				
		for(int i = 1; i <= numbers.length; ++i){
			if(hm.containsKey(target - numbers[i - 1])){
				result[0] = i;
				result[1] = hm.get(target - numbers[i - 1]);
				if(result[0] == result[1]) continue;
				break;
			}
		}
	    
		if(result[0] > result[1]){
			int tmp = result[0];
			result[0] = result[1];
			result[1] = tmp;
		}
		
	    return result;
	    }
	 
	 
	 public static void main(String[] args){
		int[] numbers = {2, 7, 11, 5};
		int[] numbers2 = {3, 2, 4};
		System.out.println(Arrays.toString(twoSum(numbers, 9)));
		System.out.println(Arrays.toString(twoSum(numbers2, 6)));
	 }
}
