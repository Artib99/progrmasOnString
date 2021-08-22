
public class ReverseStringWithoutUsingLengthAndUsingThridVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String var ="india";
		char[]	c = var.toCharArray();
		
		int count = 0;
		for(char ch:c)
		{
			count++;
		}
		String rev=" ";
		
	for(int i=count-1;i>=0;i--) {
		rev=rev+var.charAt(i);
		
	}
	System.out.print(rev);

	}
}
