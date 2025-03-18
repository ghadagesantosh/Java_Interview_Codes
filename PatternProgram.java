package InterviewJavaCodes;

public class PatternProgram {

	public static void main(String[] args) {

		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=i; j++)
			{
				if(i%2!=0) {
					System.out.print(i);
					break;
				}
				System.out.print(i);
			}
			System.out.println();
		}
		
	}

}
