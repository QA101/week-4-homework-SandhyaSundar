import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class listOfAnimals {

	public static void main(String[] args) {
        Scanner console= new Scanner(System.in);
        System.out.println("Enter the number of animals in the list:");
        String Len=console.next();
        int arrayLength = Integer.parseInt(Len);
       
        String[] animals =new String[arrayLength];    
                  
        for (int i=0;i<animals.length;i++) {	   
          System.out.print("Enter the animal Name:"); 
         animals[i]=console.next();
          }
        //call method catty using input animals to get outputArray.
       String[] outputArray=catty(animals);
        //display output String Array as a result of the method.
       System.out.println("Animals with token 'cat':"+Arrays.toString(outputArray));
       console.close(); 
	}


public static String[] catty(String[] animals) { 
     // building an arraylist of animals of type string.
    ArrayList<String> animalsList = new ArrayList<String>();
    		for (int i=0; i<animals.length; i++)
    {
       animalsList.add(animals[i]);
    }
    
    ArrayList<String> catsList = cattyB(animalsList);
    
    String cats[] = new String[catsList.size()];
        	for (int i=0; i<catsList.size(); i++)
    {
       cats[i]=catsList.get(i);
    }

    return cats;
}

public static ArrayList<String> cattyB(ArrayList<String> animalsList){    
  // building an arraylist of animalslist using type string.
	ArrayList<String> outputArray= new ArrayList<String>();
//	 ArrayList<String>token=new ArrayList<String>();
	// token.add("cat");
	 
	for (int i=0;i<animalsList.size();i++) {
	//	System.out.println("in the "+i+" for loop");
	//	System.out.println("index value:"+token.indexOf(animalsList.get(i)));
		CharSequence cat = "cat";
		if(animalsList.get(i).contains(cat)) {
		outputArray.add(animalsList.get(i));
		}
	
}
	return outputArray;
}
}