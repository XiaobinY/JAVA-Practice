package cracking;

import java.util.Arrays;

public class Q1_1 {
// if a string has all unique characters
	public static boolean isUnique1(String str){
		for(int i = 0; i < str.length(); i++){
			for(int j = i + 1; j < str.length(); j++){
				if(str.charAt(i) == str.charAt(j)){
					return false;
				}
			}
		}
		return true;
	}
	
	public static boolean isUnique2(String str){
		// int[] initialized with all 0
		// Integer[] initialized with all null
		int[] checkList = new int[256];
		for(int i = 0; i < str.length(); i ++){
			int index = (int) str.charAt(i);
			if (checkList[index] == 1){
				return false;
			} else {
				checkList[index] = 1;
			}
		}	
		return true;
	}
	
	public static boolean isUnique3(String str){
		int checkVal = 0;
		
		for(int i = 0; i < str.length(); i ++){
			int index = (int) str.charAt(i);
			if ( (checkVal / Math.pow(2, index)) % Math.pow(2, index) == 1){
				return false;
			} else {
				checkVal += Math.pow(2, index);
			}
		}
		
		
		return true;
	}
	
	public static void test(String[] strs, int selector){
		switch(selector){
		case 1:
			for( String str : strs){
				System.out.println("\"" + str + "\" is unique? " + isUnique1(str));
			}
			break;
		case 2:
			for( String str : strs){
				System.out.println("\"" + str + "\" is unique? " + isUnique2(str));
			}
			break;
		case 3:
			for( String str : strs){
				System.out.println("\"" + str + "\" is unique? " + isUnique3(str));
			}
			break;
		}
	}
	
	public static void main(String[] argu){
		String[] sample = new String[]{"Hello", "Test", "What is that?"};
		
		test(sample, 2);
	}
}
