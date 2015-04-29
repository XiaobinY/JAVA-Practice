package leetCode;

public class TitleToNumber {
	public static int titleToNumber(String s) {
        int D = s.length();
        int r = 0;
        
        for(int d = 0; d < D; ++d){
        	r = s.charAt(d) - 'A' + 1 + r * 26;
        }
        
        return r;
    }
	
	public static void main(String[] args){
		System.out.println(titleToNumber("A"));
		System.out.println(titleToNumber("AA"));
		System.out.println(titleToNumber("AB"));
		
	}
}
