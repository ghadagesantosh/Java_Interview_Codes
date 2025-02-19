package InterviewJavaCodes;

import java.util.*;

public class RemoveDuplicatesinArray{

	public static void main(String[] args) {


  String arr [] = {"java","python","c+","java","C"};
		
		HashSet<String> set = new HashSet<String>();
		
		for(String l:arr)
		{
			  set.add(l);

		}
		System.out.println(set);

		
		  int a [] = {1,1,2,3,3,4,5,6,6,6,7,8,9,10};
		  
		  HashSet<Integer> set1 = new HashSet<Integer>();
		  
		  for (int i:a)
		  {
			  set1.add(i);
		  }

		System.out.println(set1);
	}

}
