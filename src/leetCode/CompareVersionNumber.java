package leetCode;

import java.util.LinkedList;
import java.util.List;

/*
 * HOW-TO
 * 
 * get two strings
 * 
 * get the first digit,
 * compare,
 * not equal, 
 * return
 * equal
 * get the second digit
 * 
 * */

public class CompareVersionNumber {
    public static int compareVersion(String version1, String version2) {
    	int l1 = version1.length();
    	int l2 = version2.length();
    	int p1 = 0;
    	int p2 = 0;
    	
    	while(p1 < l1 && p2 < l2){
    		int d1 = 0;
    		int d2 = 0;
   
    		while(p1 < l1 && version1.charAt(p1) != '.'){
    			d1 = d1 * 10 + (version1.charAt(p1) - 48);
    			p1++;
    		}
    		p1++;

    		while(p2 < l2 && version2.charAt(p2) != '.'){
    			d2 = d2 * 10 + (version2.charAt(p2) - 48);
    			p2++;
    		}
    		p2++;
			
    		if(d1 > d2) return 1;
    		if(d1 < d2) return -1;
    	}

    	if(p1 < l1){
    		while(p1 < l1){
        		int d1 = 0;
       
        		while(p1 < l1 && version1.charAt(p1) != '.'){
        			d1 = d1 * 10 + (version1.charAt(p1) - 48);
        			p1++;
        		}
        		p1++;
        		
        		if(d1 > 0) return 1;
    		}
    	}

       	if(p2 < l2){
    		while(p2 < l2){
        		int d2 = 0;
       
        		while(p2 < l2 && version2.charAt(p2) != '.'){
        			d2 = d2 * 10 + (version2.charAt(p2) - 48);
        			p2++;
        		}
        		p2++;
        		
        		if(d2 > 0) return -1;
    		}
    	}
    	
    	return 0;
    }
    
    public static int compareVersion2(String version1, String version2) {
    	int l1 = version1.length();    	
    	int p1 = 0;
    	List<Integer> a1 = new LinkedList<>();
    	
    	while(p1 < l1){
    		int d1 = 0;

    		while(p1 < l1 && version1.charAt(p1) != '.'){
    			d1 = d1 * 10 + (version1.charAt(p1) - 48);
    			p1++;
    		}
    		p1++;

    		a1.add(d1);
    	}

    	int l2 = version2.length();    	
    	int p2 = 0;
    	List<Integer> a2 = new LinkedList<>();
    	
    	while(p2 < l2){
    		int d2 = 0;

    		while(p2 < l2 && version2.charAt(p2) != '.'){
    			d2 = d2 * 10 + (version1.charAt(p2) - 48);
    			p2++;
    		}
    		p2++;

    		a2.add(d2);
    	}

    	for(int d = 0; d < Math.min(a1.size(), a2.size()); d++){
    		if(a1.get(d) > a2.get(d)) return 1;
    		if(a1.get(d) < a2.get(d)) return -1;
    	}
    	
 
    	
    	return 0;
    }
    
    public static void main(String[] args){
    	System.out.println(compareVersion2("1.678.0", "1.678")); 
    }
}
