import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SumOfEvenIndex {

	public static void main(String[] args) {
    //Get the array input from the user
		Scanner console=new Scanner(System.in);
		System.out.println("Enter the number of elements in array:");
		int arrayLength=console.nextInt();
       
    //construct an array of length given by the user
		int[] nums=new int[arrayLength];
	
	 for(int i=0;i<nums.length;i++) {
		 System.out.println("Enter the element of the array in "+i+ " position:");
			nums[i]= console.nextInt();
		}
		console.close();
	   System.out.println(Arrays.toString(nums));
	   //call the method sumEvenIndexes() using nums array.
       System.out.println("Sum of values at Even Indexes:"+ sumEvenIndexes(nums));	  
	
	  // or directly present the array.
        // int[] nums=new int[] {1,2,3,4};
		//System.out.println("Sum of values at Even Indexes:"+ sumEvenIndexes(nums));
	}
		public static int sumEvenIndexes(int[] nums) { 

	    ArrayList<Integer> numsList = new ArrayList<Integer>();
	      for (int i=0; i<nums.length; i++)
	        {
	           numsList.add(nums[i]);
	      } 
	    return sumEvenIndexesB(numsList);
	}

	
   public static int sumEvenIndexesB(ArrayList<Integer> numsList) {

	    int Sum=0;
		for (int i= 0; i<numsList.size(); i++) {
			if (i % 2==0) {
		     Sum += numsList.get(i);
		// System.out.println("Value of numsList:"+numsList);
			
		}
	}
		
	return Sum;
}
}
