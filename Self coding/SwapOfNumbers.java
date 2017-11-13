
public class SwapOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=2;
		int b=5;
		
		System.out.println("a:"+a +" b:"+b);
		SwapOfNumbers(a, b);
	
	}

	public static void SwapOfNumbers(int x,int y) {
		// TODO Auto-generated method stub
		int temp;
		temp=x;
		x=y;
		y=temp;
		System.out.print("x:"+x+ " y:"+y);
	}

}
