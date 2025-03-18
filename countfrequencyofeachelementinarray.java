package InterviewJavaCodes;

import java.util.LinkedHashMap;

public class countfrequencyofeachelementinarray {

	public static void main(String[] args) {

		 int a [] = {1, 2, 2, 3, 4, 4, 4};
		 
	     LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>();  //HashMap will print value in random order
	    
	        for(int ch:a)
	        {
	            if(!map.containsKey(ch))
	            {
	             map.put(ch,1);   
	            }
	            else
	            {
	                int n=map.get(ch);
	                map.put(ch,n+1);
	                
	            }
	        }
	        System.out.println(map);
		
	}

}
