import java.util.Scanner;

public class MinOfThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console= new Scanner(System.in);
		System.out.println("Enter the Number:");
	     int inputNumber1=console.nextInt();
	    System.out.println("Enter the Number:");
	     int inputNumber2=console.nextInt();
	    System.out.println("Enter the Number:");
	     int inputNumber3=console.nextInt();
	    System.out.println(MinOfThreeNunmber(inputNumber1,inputNumber2,inputNumber3));
	
	
	}

	public static int MinOfThreeNunmber(int x,int y,int z) {
		// TODO Auto-generated method stub
	   
		int output=Math.min(x, Math.min(y,z));
		System.out.println("MinValue"+" ");
		return output;
		
		//	if(x<y && x<z) {
		//	return x;
		//}
		//else if(y<z) {
		  //  return y;
		//}
		//else {
			//return z;
		//}
	
	}

}
