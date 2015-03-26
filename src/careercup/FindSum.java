package careercup;

public class FindSum {
/*
 * Question:  Given a sequence of positive integers A and an integer T, 
 * return whether there is a continuous sequence of A that sums up to exactly T
 */
	public static boolean findSum (int [] A ,int T){
		int sum = 0 ;
		int j = 0;
		for (int i = 0 ; i < A.length ; ++i) {
			while (j < A.length &&  sum < T) {
				sum += A[j] ;
				j++;
			}			
			if (sum == T) {
				return true ;
			}
			sum -= A[i] ;
		}
						
		return false ;
	}
	
	public static Boolean findSum2(Integer[] A, Integer T){
		if(T == 0) return true;
		if(T < 0) return false;
		if(A.length == 0) return false;
		
		Integer[] B = new Integer[A.length - 1];
		for(int i = 0; i < B.length; i++){
			B[i] = A[i+1];
		}
		
		return findSum2(B, T - A[0]);
	}
	
	public static Boolean findSumStarter(Integer[] A, Integer T){
		for(int i = 0; i < A.length; ++i){
			Integer[] B = new Integer[A.length - i];
			for(int j = 0; j < B.length; j++){
				B[j] = A[j+i];
			}
			Boolean result = findSum2(B, T);
			if(result) return true;
		}
		return false;
	}
	
	public static void main(String[] args){
		Integer[] A1 = {23, 5, 4, 7, 2, 11};
		Integer T1 = 20;
		
		Integer[] A2 = {1, 3, 5, 23, 2};
		Integer T2 = 8;
		
		Integer[] A3 = {1, 3, 5, 23, 2};
		Integer T3 = 7;

		System.out.println(findSumStarter(A1, T1));
		System.out.println(findSumStarter(A2, T2));
		System.out.println(findSumStarter(A3, T3));
	}
}
