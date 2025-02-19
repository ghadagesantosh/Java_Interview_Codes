package InterviewJavaCodes;

public class NumberRepeatedinArray {

	public static void main(String[] args) {
		
		int a[] = {10,20,30,4,0,10,10,10};
		
		int num =10;
		int count=0;
		
		for(int value:a)
		{
			if (value == num)
			
			{
				count++;
			}
		}
		
		System.out.println(count);
	}
	
	

}
