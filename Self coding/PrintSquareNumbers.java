
public class PrintSquareNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int limit=7;
		System.out.println("Seven Square Numbers:");
		SevenSquareNumbers(limit);
		
	}

	public static String SevenSquareNumbers(int methodLimit) {
		String squareNum=" ";
		for(int i=1;i<=methodLimit;i++) {
			int output= (int) Math.pow(i,2);
			System.out.print(output+" ");
		}	
		return squareNum;
	}
	
}
