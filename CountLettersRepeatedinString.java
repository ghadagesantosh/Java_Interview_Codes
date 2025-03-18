package InterviewJavaCodes;

import java.util.*;

public class CountLettersRepeatedinString {

	public static void main(String[] args) {
		
		//Count Number of Letters From String
		
		
        String s="santoshghadage";
     LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();  //HashMap will print value in random order
        char[] c=s.toCharArray();
    
        for(char ch:c)
        {
            if(!map.containsKey(ch))
            {
             map.put(ch,1);   
            }
            else
            {
                int n=map.get(ch);
                map.put(ch,n+1);
                
            }
        }
        System.out.println(map);
       
    }
}
	
