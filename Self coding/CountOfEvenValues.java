import java.util.*;
public class CountOfEvenValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
			    System.out.println("Count of Even Values of an array:"+ evenCount(nums));
		// other way to present array.	    
		//int[] nums=new int[] {8,16,10};
       // System.out.println("Count of Even Values of an array:"+ evenCount(nums));
	}
	public static int evenCount(int[] nums) { 

	    ArrayList<Integer> numsList = new ArrayList<Integer>();
	    for (int i=0; i<nums.length; i++)
	    {
	       numsList.add(nums[i]);
	    }
	    
	    return evenCountB(numsList);
	}

	public static int evenCountB(ArrayList<Integer> numsList)	{     
       int count=0;
       for(int i= 0; i<numsList.size();i++) {
    	  if(numsList.get(i)%2==0) {
    		  count++;
    	  }
       }
	return count;	
	}

}
