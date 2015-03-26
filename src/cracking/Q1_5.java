package cracking;

public class Q1_5 {
// String compression aabcccccaaa -> a2b1c5a3
	public static String compress(String str){
		String comp = new String();
		
		for(int i = 0; i < str.length(); ){
			int j = 0;
			while(str.charAt(i) == str.charAt(i + j)){
				j++;
				if(i + j >= str.length()) break;
			}
			comp += str.charAt(i);
			comp += j;
			
			i = i + j;
		}
		
		return str.length() > comp.length() ? comp : str;
	};
	
	public static void main(String[] argu){
		String str1 = "aabcccccaaa";
		String str2 = "abcabdabds";
 		System.out.println(str1);
		System.out.println(compress(str1));
 		System.out.println(str2);
		System.out.println(compress(str2));

	}
	
}
