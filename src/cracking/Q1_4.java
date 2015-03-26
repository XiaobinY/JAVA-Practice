package cracking;

public class Q1_4 {
	public static char[] replaceSpace(char[] ca){
		int tail = 0;
		int pointer = 0;
		
		for(char c : ca){
			if (c == 0){
				break;
			}
			if (c == ' '){
				tail += 3;
				pointer += 1;
			} else {
				tail += 1;
				pointer += 1;
			}
		}
		
		System.out.println("Pointer = " + pointer + ", Tail = " + tail);
		
		while (pointer < tail){
			if(ca[pointer] == ' '){
				ca[tail --] = '0';
				ca[tail --] = '2';
				ca[tail --] = '%';
				pointer --;
			} else {
				ca[tail --] = ca[pointer];
				pointer --;
			}
			
			
		}	
		return ca;
	}
	
	public static void main(String[] argu){
		char[] ca = new char[20];
		String str = "Mr John Smith！";
		for(int i = 0; i < str.length(); i++){
			ca[i] = str.charAt(i);
		}
		
		String replaced = new String(replaceSpace(ca));

		System.out.println(str);
		System.out.println(replaced);
	}
}
