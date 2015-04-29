package sandBox;

import java.util.Arrays;

public class Sort {
	/*
	public static void quickSortStarter(int[] a){
		int lo = 0;
		int hi = a.length - 1;
		quickSort(a, lo, hi);
	}
	
	public static void quickSort(int[] a, int lo, int hi){
		if(lo >= hi) return;		
		
		int mi = partition(a, lo, hi);
		if(lo < mi - 1) quickSort(a, lo, mi - 1);
		if(hi > mi) quickSort(a, mi, hi);
	}
	
	public static int partition(int[] a, int i, int j){
		int lo = i;
		int hi = j;
		int p = a[(lo + hi)/2];
		
		while(lo <= hi){
			while(a[lo] < p) lo ++;
			while(a[hi] > p) hi --;
			if(lo <= hi) {
				int tmp = a[lo];
				a[lo] = a[hi];
				a[hi] = tmp;
				lo ++;
				hi --;
			}
		}
		
		return lo;
	}
	*/
	
	public static void quickSortStarter(int[] a){
		if(a == null || a.length == 0 || a.length == 1) return;
		int lo = 0;
		int hi = a.length - 1;
		quickSort(a, lo, hi);
	}
	
	public static void quickSort(int[] a, int lo, int hi){
		if(lo >= hi) return;
		
		int mi = partition(a, lo, hi);
		if(lo < mi - 1) quickSort(a, lo, mi - 1);
		if(hi > mi) quickSort(a, mi, hi);
	}
	
	public static int partition(int[] a, int lo, int hi){
		int p = a[(lo + hi)/2];
		
		while(lo <= hi){
			while(a[lo] < p) lo ++;
			while(a[hi] > p) hi --;
			if(lo <= hi){
				int tmp = a[lo];
				a[lo] = a[hi];
				a[hi] = tmp;
				lo ++;
				hi --;
			}
		}
		return lo;
	}
	
	/*
	public static void mergeSortStarter(int[] a){
		int lo = 0;
		int hi = a.length - 1;
		mergeSort(a, lo, hi);
	}
	
	public static void mergeSort(int[] a, int lo, int hi){
		if(lo < hi){
			int mi = (lo + hi)/2;
			mergeSort(a, lo, mi);
			mergeSort(a, mi + 1, hi);
			mergePart(a, lo, mi, hi);
		}
	}
	
	public static void mergePart(int[] a, int lo, int mi, int hi){
		int[] tmp = new int[a.length];
		
		for(int i = 0; i <= hi; ++i){
			tmp[i] = a[i];
		}
		
		int i = lo;
		int j = mi + 1;
		int k = lo;
		
		while(i <= mi && j <= hi){
			if(tmp[i] < tmp[j]){
				a[k] = tmp[i];
				i++;
			} else {
				a[k] = tmp[j];
				j++;
			}
			k++;
		}
		
		while(i <= mi){
			a[k] = tmp[i];
			k++;
			i++;
		}
	}
	*/
	
	public static void mergeSortStarter(int[] a){
		int lo = 0;
		int hi = a.length - 1;
		mergeSort(a, lo, hi);
	}
	
	public static void mergeSort(int[] a, int lo, int hi){
		if(lo < hi){
			int mi = (lo + hi)/2;
			mergeSort(a, lo, mi);
			mergeSort(a, mi + 1, hi);
			mergeParts(a, lo, mi, hi);
		}
	}
	
	public static void mergeParts(int[] a, int lo, int mi, int hi){
		int[] tmp = new int[a.length];
		for(int i = lo; i <= hi; ++i){
			tmp[i] = a[i];
		}
		
		int i = lo;
		int j = mi + 1;
		int k = lo;
		
		while(i <= mi && j <= hi){
			if(tmp[i] < tmp[j]){
				a[k] = tmp[i];
				i++;
			} else {
				a[k] = tmp[j];
				j++;
			}
			k++;
		}
		
		while(i <= mi){
			a[k] = tmp[i];
			i++;
			k++;
		}
	}
	
	public static void main(String[] args){
		int[] a = {1,2,6,3,8,5,10,10,10,5,4};
		//int[] a = {4,3,2,1};
		
		System.out.println(Arrays.toString(a));
		mergeSortStarter(a);
		System.out.println(Arrays.toString(a));
	}
}
