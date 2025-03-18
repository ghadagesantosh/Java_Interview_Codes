package InterviewJavaCodes;

public class MaxMinValueFromArray {

	public static void main(String[] args) {

		int a[] = {20,60,85,64,14};
		
		int max = a[0];
		
		//Printing max no

		for (int i=1; i<a.length; i++)
		{
			if (a[i]>max)
			{
				max= a[i];
			}
		}
		
		System.out.println("Max element from array is:" + max);
		
		
		//Printing min no
		
		int min =a[0];
		for (int i=1; i<a.length; i++)
		{
			if (a[i]<min)
			{
				min= a[i];
			}
		}
		
		System.out.println("Min element from array is:" + min);
				
	}

}
