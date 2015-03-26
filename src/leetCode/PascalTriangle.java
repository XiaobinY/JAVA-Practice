package leetCode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
	public static List<List<Integer>> generate(int numRows){		
		List<Integer> newRow = new ArrayList<>();
		List<Integer> preRow = new ArrayList<>();
		List<List<Integer>> result = new ArrayList<>();
		
		if(numRows == 0) return result;
		
		newRow.add(1);
		result.add(newRow);
		
		for(int r = 1; r < numRows; ++r){
			newRow= new ArrayList<>();
			preRow = result.get(r - 1);
			newRow.add(preRow.get(0));
			for(int i = 1; i < r; ++i){
				newRow.add(preRow.get(i - 1) + preRow.get(i));
			}
			newRow.add(preRow.get(preRow.size() - 1));
			result.add(newRow);
		}
		
		return result;
	}
	
	public static void printTri(List<List<Integer>> pn){
		for(int i = 0; i < pn.size(); ++i){
			System.out.println(pn.get(i).toString());
		}
	}
	
	
	
	public static void main(String[] args){
		printTri(generate(5));
		
	}
}
