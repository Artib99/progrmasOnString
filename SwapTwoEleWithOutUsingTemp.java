
public class SwapTwoEleWithOutUsingTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=20;
		
		a=a+b;
		b=a-b;
		System.out.print(b);
		a=a-b;
		System.out.print(a);

	}

}
