package InterviewJavaCodes;

import java.util.Arrays;

public class EvenAndOddNumbers {

	public static void main(String[] args) {

		int arr[]={1,2,3,4,5,6};
		
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length;i++)
		{
		    if(arr[i]%2==0)
		    {
		        System.out.println("EVEN NUMBER"+arr[i]);
		    }
		    else
		    {
		        System.out.println("ODD NUMBER"+arr[i]);
		    }
	}


	}
}
