package InterviewJavaCodes;

import java.util.Arrays;

public class FindSecondLargestNo {

	public static void main(String[] args) {

		int a[] = {10,50,90,9,2,1};
		
		Arrays.sort(a);
		
		int SecondLargestNo = a[a.length-2];
		int small = a[0];
		int large = a[a.length-1];
		
		System.out.println("Second Largest No from Array:" + SecondLargestNo );  // (a.length-2) not correct way a[a.length-2]
		System.out.println("Lowest Number from Array:" + small );
		System.out.println("Largest number from Array:" + large);
		
		int diff =large - small;
		System.out.println("diff bet large and small:" + diff);

		

	}

}
