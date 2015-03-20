package datatype;

import java.util.Arrays;

public class Array {
	public static void main(String[] argus){
		// Declare array
		int[] array1;
		array1 = new int[10];
		
		int[] array2 = new int[10];
		
		int[] array3 = {1, 2, 3, 4, 5, 6, 7};
		
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		System.out.println(Arrays.toString(array3));
	}
}
