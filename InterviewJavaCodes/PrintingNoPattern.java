package InterviewJavaCodes;

public class PrintingNoPattern {

	public static void main(String[] args) {

		int a[] = {1,2,3,4,5};
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print(a[i] + " ");
			}
			System.out.println();
		}
	}

}


