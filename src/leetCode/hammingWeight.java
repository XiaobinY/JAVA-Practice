package leetCode;

public class hammingWeight {
    public static int hammingW(int i) {
        
        if(i == 0) return 0;
		if(i == 1) return 1;
		
		int mask = 0x00000001;
		
		if((i & mask) == 1) return 1 + hammingW(i >>> 1);
		if((i & mask) == 0) return hammingW(i >>> 1);
		
		return 0;
    }
	
	public static void main(String[] args){
		System.out.println(hammingW(-11));
		System.out.println(Integer.toString(-11, 2));
		System.out.println(0b11);
	}
}
