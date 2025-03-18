package InterviewJavaCodes;

import java.util.HashSet;

public class FindDuplicatesFromJava {

	public static void main(String[] args) {

		String arr [] = {"java","python","c+","java","C"};
		
		HashSet<String> set = new HashSet<String>();
		
		boolean flag = false;
		for(String l:arr)
		{
			if(set.add(l)==false)
				
			
			System.out.println("Duplicate found in String:" + l);
			flag =true;
			

		}
		
	
	
	if(flag== false)
	{
		System.out.println("Duplicates element not found");
	}

	
	// Using for Loop
	
	String arr1 [] = {"java1","python","c+","java1","C"};
	
	for (int i=0; i<arr1.length; i++)
	{
		for (int j=i+1;j<arr1.length; j++ )
		{
			
			if (arr1[i]==arr1[j])
			{
				System.out.println("Duplicate found in Stringarray:" + arr1[i]);
			}
		}
	}

	
}}
