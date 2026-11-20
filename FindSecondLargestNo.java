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

		    
//-------------------------------------------------------------------------------------------------
		int arr2[]={100,10,75,4,90,1};
        int max=0;
        int second=0;
        for(int i=0;i<arr2.length;i++){
            if(arr2[i]>max){
                second=max;
                max=arr2[i];
            }else if(arr2[i]>second){
                second = arr2[i];
            }
        }
        System.out.println(second);

	}

}
