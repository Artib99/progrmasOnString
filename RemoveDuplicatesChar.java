import java.util.LinkedHashSet;

public class RemoveDuplicatesChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="india";
		
LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		
		for(char ch : set)
		{
			System.out.print(ch);
		}
	}

}
