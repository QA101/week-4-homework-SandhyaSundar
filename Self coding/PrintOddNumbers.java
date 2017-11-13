
public class PrintOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int limit=20;
		System.out.println("Odd Numbers:");
		PrintOddNumbers(limit);
	}

	public static String PrintOddNumbers(int methodLimit) {
		// TODO Auto-generated method stub
		String oddNumber=" ";
		for(int i=1;i<=methodLimit;i++) {
			if (i%2!=0) {
				int output=i;
				System.out.print(output+" ");
			}
		}
		
		return oddNumber;
	}

}
