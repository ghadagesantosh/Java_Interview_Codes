package InterviewJavaCodes;

public class RemoveSpecialCharacters {

	public static void main(String[] args) {

		  String s="wel&&%%^^())*come";
		    String z=s.replaceAll("[^a-zA-Z0-9]", "");
		    System.out.println(z);
	}

}
