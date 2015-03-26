package careercup;

import java.util.ArrayList;

public class Stairs {
	public static void stairs(int k, String s){
		if(k == 1){
			System.out.println(s + '1');
			return;
		}
		
		if(k == 2){
			System.out.println(s + "11");
			System.out.println(s + '2');
			return;
		}
		
		stairs(k - 1, s + '1');
		stairs(k - 2, s + '2');
	}

	public static void stairsAL(int k, ArrayList<Integer> s){
		/*
		if(k == 1){
			s.add(1);
			System.out.println(s.toString());
			return;
		}
		
		if(k == 2){
			ArrayList<Integer>a = s;
			ArrayList<Integer>b = s;
			a.add(1);
			a.add(1);
			b.add(2);
			
			System.out.println(a.toString());
			System.out.println(b.toString());
			return;
		}
		
		ArrayList<Integer>x = s;
		ArrayList<Integer>y = s;
		x.add(1);
		y.add(2);
		
		stairsAL(k - 1, x);
		stairsAL(k - 2, y);
		*/
	}

	
	public static void main(String[] args){
		stairs(3, "");
	}
	
}
