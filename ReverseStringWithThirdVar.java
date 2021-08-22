
public class ReverseStringWithThirdVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String var = "TYSS";
		
		String rev = "";
		
		for(int i=var.length()-1;i>=0;i--) {
			
			rev=rev+var.charAt(i);
		}
		System.out.print(rev);
	}

}
