package sort;

import sort.Helper;

public class BubbleSort {
	
	
	public static void bubbleSort(int[] input){
		System.out.println("Array Length is " + input.length);
		//System.out.println("Original array is " + Arrays.toString(input));
		long startTime = System.currentTimeMillis();
		for(int i = 1; i < input.length; i++){
			for(int j = 0; j < input.length - i; j++){
				if(input[j] > input[j+1]){
					Helper.swap(input, j, j+1);
				}
			}
		}
		
		//System.out.println("Sorted array is " + Arrays.toString(input));
		long stopTime = System.currentTimeMillis();
	    long elapsedTime = stopTime - startTime;
	    System.out.println("Sorting takes " + elapsedTime);
	}
	
	public static void main(String[] argus){
		for(int i = 0; i < 15; i++){
			int l = (int) Math.pow(2, i);
			int[] intA = Helper.generator(l);
			//System.out.println("intA's length is " + intA.length);
			bubbleSort(intA);
		}
		
	}
}
