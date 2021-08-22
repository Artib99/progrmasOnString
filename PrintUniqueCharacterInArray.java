import java.util.HashSet;
import java.util.LinkedHashSet;

public class PrintUniqueCharacterInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s = "Welcomeee";
		//step 1: create set coll to remove duplicate of given string
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		
		//step 2: compare each char of set with all char of given string
		
		for(char ch:set)//a n d i
		{
			//System.out.println(ch);
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				if(ch==s.charAt(i))
				{
					count++;
				}
			}
			
			//step 3: print unique characters in the string
			if(count==1) {
			System.out.print(ch);
		}
	}

	}
}
