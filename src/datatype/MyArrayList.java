package datatype;

import java.util.ArrayList;

public class MyArrayList {
	public static void main(String[] argu){
		// Initialization
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>(10);
		//ArrayList<Double> list3 = new ArrayList<>(collection);
		
		// Add and get and size
		list1.add(10);
		list1.add(2);
		list1.add(1812);
		list1.add(2);
		list1.add(314);
		
		
		for( int i = 0; i < list1.size(); i++){
			System.out.print(list1.get(i) + " ");
		}
		
		System.out.println();
		System.out.println("Size of list1 is " + list1.size());
		System.out.println("Size of list2 is " + list2.size());
		
		// indexOf and lastIndexOf
		int a = list1.indexOf(2);
		int b = list1.lastIndexOf(2);
		System.out.println("Frist index of 2 is " + a + ", last is " + b);
		
		// set
		list1.set(1, 100);
		for( int i : list1){
			System.out.print(i + " ");
		}
		System.out.println();
				
		// isEmpty and clear
		System.out.println("link2 is empty? " + list2.isEmpty());
		System.out.println("link1 is empty? " + list1.isEmpty());
		list1.clear();
		System.out.println("After clear, \nlink1 is empty? " + list1.isEmpty());
	}
	
}
