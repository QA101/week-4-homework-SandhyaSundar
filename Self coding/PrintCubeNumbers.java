
public class PrintCubeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int limit=10;
   System.out.println("Cube Numbers:");
   CubeNumbers(limit);
   
	}

	public static String CubeNumbers(int methodLimit) {
		// TODO Auto-generated method stub
		String CubeNum=" ";
		for (int i=1;i<=methodLimit;i++) {
			int output= (i*i*i);
			System.out.print(output+" ");
			
		}
	return CubeNum;
	} 

}
