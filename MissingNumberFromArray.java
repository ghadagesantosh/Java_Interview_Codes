package InterviewJavaCodes;

public class MissingNumberFromArray {

	public static void main(String[] args) {

		int a[] = {1,2,3,4,5,7,8,9,10};
		int sum1=0;
		
		for(int i=0; i<a.length; i++)
		{
			sum1= sum1+a[i];
		}
		System.out.println("Sum of elememt from array:" +  sum1);
		
		//sum of elements in the range of 1 to 10
		int sum2=0;
		
		 for (int i=0; i<=10; i++)
		 {
			 sum2=sum2+i;
		 }
		
		System.out.println("sum of elements in the range of 1 to 10:" +sum2);
		
		System.out.println("Missing no from array is:" + (sum2-sum1));
	}

}
