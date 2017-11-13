
public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int limit=10;
		
		System.out.println("Factorial of Numbers:");
		Factorial(limit);
	}

	public static int Factorial(int methodInput) {
		int Product=1;
		for(int i=1;i<=methodInput;i++) {
			Product*=i;
		System.out.println(i+"!="+ Product);
		}
		
		return Product;	
	}

}
