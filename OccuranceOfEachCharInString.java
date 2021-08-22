import java.util.HashSet;

public class OccuranceOfEachCharInString {
//numbr of occurance of each charater in string
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Welcome to india";
		//step 1: create set coll to remove duplicate of given string
		HashSet<Character> set = new HashSet<Character>();
		
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		
		//step 2: compare each cahr of set withall char of givn string
		
		for(char ch:set)//a n d i
		{
			//System.out.println(ch);
			int count=0;//number of occurance
			for(int i=0;i<s.length();i++)
			{
				if(ch==s.charAt(i))
				{
					count++;
				}
			}
			
			//step 3: print char and count
			System.out.println(ch+" "+count);
		}

	}

}
