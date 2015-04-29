package leetCode;

public class TrailingZeros {
	public static int trailingZeroes(int n) {
		int r = 0;
		for(int x = 5; x <= n/5; x = 5*x){
			System.out.println(x);
			r += (n / x);
		}
		return r;
    }
	
	public static long factorial(int n){
		if(n == 1){
			return 1;
		} else {
			return (long)n * factorial(n - 1);
		}
		
	}
	
	public static void main(String[] args){
		int n = 2147483647;
		//System.out.println(factorial(n));
		System.out.println(trailingZeroes(n));
	}
}
