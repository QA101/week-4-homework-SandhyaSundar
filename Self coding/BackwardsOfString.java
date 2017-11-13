import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BackwardsOfString {

	public static void main(String[] args) {
		// Get an input string from user
		Scanner console=new Scanner(System.in);
		System.out.println("Enter the string:");
		String inputString =console.next();
		// Convert the input string to Char array
		//char[] inputCharArray = inputString.toCharArray();
	    //  System.out.println("Input char array:"+Arrays.toString(inputCharArray));
		
		// Call backwardChars method using the inputString and get the result outputArray
		String[] outputArray= backwardChars(inputString);
		
        //Display the outputArray as an array
		System.out.println("Reverse string:"+Arrays.toString(outputArray));
		
	    // closing the console to avoid resource leak
		console.close();
	}
		public static String[] backwardChars(String str) { 
     // Arraylist of string type charsList is initialized with the output of the method
	 //call backwarsCharsB.
		    ArrayList<String> charsList = backwardCharsB(str);
		    // construct a new array chars of type string with length of arraylist charsList.
		    String chars[] = new String[charsList.size()]; 
		    for (int i=0; i<charsList.size(); i++) {
		     // Building an array with arraylist.     
		    	chars[i]=charsList.get(i);
		        }
		    return chars;
		}

		public static ArrayList<String> backwardCharsB(String str) {
			String element="";	
			ArrayList<String> resultArrayList = new ArrayList<String>();	
			
		 for( int i=0;i<str.length();i++) {
			// creating a variable element of type String and assigning the 
			 System.out.println("in the first for loop in second method and value of i:"+i);
			 System.out.println("value of element(before):"+element);
				 element=  str.charAt(i)+ element;
		     System.out.println("value of element(after):"+element);	 
			              //str.remove(charsList.get(i);
				     // String[] output= str.add(charsList.get(i));
		 }		
			int k=1;
			System.out.println("length of element"+element.length());
			for (int j=0;j<element.length(); j++) {
			System.out.println("in the second for loop in second method and value of j:"+j);
			System.out.println("value of resultArrayList(before):"+resultArrayList);
			System.out.println("value of j,k:"+j+","+k);
			System.out.println("element.substring("+j+","+k+"):"+element.substring(j,k));
				resultArrayList.add(j,element.substring(j,k));
				k=k+1;
				System.out.println("Value of k after increment:"+k);
			System.out.println("value of resultArrayList:(after)"+resultArrayList);
			}
			return resultArrayList;   

		}
	}

