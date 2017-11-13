import java.util.Scanner;
public class ProductOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner console=new Scanner(System.in);
		System.out.println("Product of a number:");
		int inputNumber=console.nextInt();
		
		System.out.println("Product of digits of a number:"+ProductOfNumber(inputNumber));
	}
	public static int ProductOfNumber(int methodInput) {
		// TODO Auto-generated method stub
		int product=1;
		int i=0;
	
	for(i=methodInput;methodInput!=0;methodInput=methodInput/10) {
			     
		    	  i=methodInput%10;
			      product= product*i;
		}
		return product;
	}

}
