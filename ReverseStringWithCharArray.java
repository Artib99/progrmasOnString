
public class ReverseStringWithCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String var="india";
	char[]	c = var.toCharArray();
	
	int count = 0;
	for(char ch:c)
	{
		count++;
	}
	
	
for(int i=count-1;i>=0;i--) {
	System.out.print(var.charAt(i));
}
	}

}
