package cracking;

import java.util.Arrays;

public class Q1_3 {
	//two strings, decide if one is a permutation of the other
	public static boolean isPer(String str1, String str2){
		if( str1.length() != str2.length()){
			return false;
		}
		
		int[] checkList = new int[256];
		
		for(int i = 0; i < str1.length(); i++){
			checkList[str1.charAt(i)] += 1;
		}

		for(int i = 0; i < str1.length(); i++){
			checkList[str2.charAt(i)] -= 1;
		}

		for(int i : checkList){
			if(i != 0) return false;
		}

		return true;
	}
	
	public static void main(String[] argu){
		String str1 = "abcd";
		String str2 = "adcb";
		String str3 = "sfer";
		String str4 = "cdba";
		
		System.out.println(str1 + " X " + str2 + " -> " + isPer(str1, str2));
		System.out.println(str2 + " X " + str1 + " -> " + isPer(str2, str1));
		System.out.println(str1 + " X " + str3 + " -> " + isPer(str1, str3));
		System.out.println(str3 + " X " + str1 + " -> " + isPer(str3, str1));
		System.out.println(str4 + " X " + str2 + " -> " + isPer(str4, str2));
		System.out.println(str2 + " X " + str4 + " -> " + isPer(str2, str4));
		
		boolean[] boo = new boolean[10];
		System.out.println(Arrays.toString(boo));
	}
}
