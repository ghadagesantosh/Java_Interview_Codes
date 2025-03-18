package InterviewJavaCodes;

public class StringAddition {

	public static void main(String[] args) {

		String s1 = "10,000";
        String s2 = "20,000";
    
     String s3=s1.replaceAll(",","");
     String s4=s2.replaceAll(",","");
            
            int a = Integer.parseInt(s3);
             int b= Integer.parseInt(s4);
             
             int c= a+b;
             System.out.println(c);

	}

}
