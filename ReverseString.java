package InterviewJavaCodes;

public class ReverseString {

	public static void main(String[] args) {

	    String s="NAMAN";
	    String rev="";
	    

	    for (int i=s.length()-1; i>=0;i--)
	    {
	        rev=rev+ s.charAt(i);
	    }
	    
	    System.out.println(rev);
	    
	    
	    //check it is palindrome or not
	    
	    if (s.equals(rev))
	    {
	        System.out.println("Given String is palindrome");
	    }
	    
	    else 
	    {
	     System.out.println("Given String is not palindrome");

	    }
	    
	   
	}
	}


