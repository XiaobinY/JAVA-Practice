package cracking;

public class Q1_2 {
	public static String reverseCString(String str){
		char[] charArray = str.toCharArray();
		int head = 0;
		int tail = charArray.length - 2;
		
		while(head < tail){
			char tmp = charArray[head];
			charArray[head] = charArray[tail];
			charArray[tail] = tmp;
			head ++;
			tail --;
		}
		
		String revertedStr = new String(charArray);
		return revertedStr;
	}
	
	public static void main(String[] argu){
		String str1 = "vasrwf\0";
		String str2 = "asfdasgf sfas 123 sdfa\0";
		
		System.out.println(str1 + "END");
		System.out.println(reverseCString(str1) + "END");
		System.out.println(str2 + "END");
		System.out.println(reverseCString(str2) + "END");
	}
	
}
