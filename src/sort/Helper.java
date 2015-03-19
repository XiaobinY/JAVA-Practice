package sort;

public class Helper {
	public static int[] generator(int l){
		int[] list = new int[l];
	    for (int i=0; i<l; i++){
	        int n = (int)(Math.random()*99 + 1);
	        list[i] = n;
	    }
	    return list;
	}
	
	public static void swap(int[] input, int i, int j){
		int tmp = input[i];
		input[i] = input[j];
		input[j] = tmp;
	}
}
