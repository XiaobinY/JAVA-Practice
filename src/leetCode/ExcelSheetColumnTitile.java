package leetCode;

/*
 * How to do
 * get an int n
 * */
public class ExcelSheetColumnTitile {
	public static String convertToTitle(int n) {
        StringBuilder result = new StringBuilder();
        
        
        while(true){
        	n = n - 1;
        	
        	if(n < 26){
        		result = result.append((char)(n + 65));
        		break;
        	}
        	
        	result = result.append((char)(n%26 + 65));
        	n = n/26;
        }
        
        
        return result.reverse().toString();
	}
	
	public static void main(String[] args){
		for(int n = 1; n < 60; n ++){
			System.out.println(n + " -> " + convertToTitle(n));			
		}

	}
}
