package InterviewJavaCodes;

public class ReverseArray {

	public static void main(String[] args) {

         int a[]= {1,2,3,4,5,6,7};
         
         for (int i=a.length-1;i>=0;i--)
         {
        	 System.out.println(a[i]);
         }
         
         
         //using while loop
    	 int i=a.length-1;
    	 while (i>=0)
    	 {
    		 System.out.println(a[i]);
    		 i--;
    	 }

	}
	

}
