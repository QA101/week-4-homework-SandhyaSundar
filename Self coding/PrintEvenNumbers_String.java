
public class PrintEvenNumbers_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	   int limit=5;
	System.out.println("Even Numbers:");
	System.out.println(PrintEvenNumbers(limit));
	
	}

	public static String PrintEvenNumbers(int methodLimit) {
		// TODO Auto-generated method stub
		String evenNumber=" ";
		 for (int i=1;i<=methodLimit;i++) {
			  if (i%2==0) {
				int output= i;
				System.out.print(output+" ");	
			}
		}
		return evenNumber ;
	}

}
