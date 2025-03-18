package InterviewJavaCodes;

public class EvenandOddNumber {

	public static void main(String[] args) {

     	int a[] = {1,2,3,4,5,6,7,8,9};
//		
//		for (int i=0; i<a.length; i++)
//			
//		{
//			if (a[i]%2==0)
//				
//				System.out.println("Printing a even no:" + a[i]);
//			
//
//			else {
//				System.out.println("Printing a odd no:" + a[i]);
//			}
//			
//		}
		
		
		//or 
		
       for (int value:a)
			
		{
			if (value%2==0)
				
				System.out.println("Printing a even no:" + value);

	}

          	for (int i=0; i<a.length; i++)
          	{
          		if (a[i]%2!=0)
          			
          		{
    				System.out.println("Printing a odd no:" + a[i]);

          		}
          	}
}
}
