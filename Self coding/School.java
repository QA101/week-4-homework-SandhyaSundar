import java.util.ArrayList;

public class School {
	
	//Variables for this class
	String name;
	int numStudents = 0;
	int numTeachers=0;
	ArrayList<Book> catalog = new ArrayList<Book>();
	ArrayList<Student> StudentList=new ArrayList<Student>();
	ArrayList<Teacher> TeacherList=new ArrayList<Teacher>();
	

	/**
	 * Start the execution of your program here.
	 * 
	 * --------------INSTRUCTIONS----------------
	 * 1. The main method should create a school, add books to its catalog, and print all the books in its catalog.
	 * Use the library class for reference.
	 * 
	 * 2. After printing the books, the program should add students and print the total number of student.
	 * 
	 * 3. Finally, the program should call other methods that you design and print anything that makes sense for a school.
	 * 
	 * Thoughts:
	 * Schools have books, students, teachers, principles, classes.
	 * Add students, remove students, add teachers, open the school, close the school.
	 * 
	 * ----------------CHALLENGE:----------------
	 * 
	 * Can a school have a library? How would this be represented within the school?
	 * 
	 */

	/**
	 * Constructs a school.
	 * this.name refers to the global variable for the class. String name is the name we pass in when building the school
	 * @param name
	 */
	public School(String name) {
		this.name = name;
	}
	
	/**
	 * Write a method to return a list of all books at the school
	 */

	public String toString() {
		String returnString = "";
		for( Book b : catalog) {
			returnString += b + "\n";
		}
		return returnString;
	}
	public void AddSingleStudent() {
		numStudents++;
		//Do I need a MAX_STUDENTS ???
	}
	
	public void removeSingleStudent() {
		if(numStudents > 0) {
			numStudents--;
		}
	}
	
	public int getStudents() {
		return numStudents;
	}
	public void AddSingleTeacher() {
		numTeachers++;

}
	public int getTeachers() {
		return numTeachers;
	}	
	
}