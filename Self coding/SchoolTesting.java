
public class SchoolTesting {

	public static void main(String[] args) {
		//TODO create a school (similar to the library)
		School Obj1= new School("MSP");
		School Obj2= new School("SSS");
				
		Teacher T1= new Teacher("Tony");
		Obj1.AddSingleTeacher();
		Teacher T2=new Teacher("Martha");
		Obj1.AddSingleTeacher();
		Teacher T3=new Teacher("Lizzy");
		Obj1.AddSingleTeacher();
		Teacher T4=new Teacher("George");
		Obj2.AddSingleTeacher();
		
		System.out.println();
		
		T1.TeachId(1002);
		T1.TeachDept("Business Mgt");
		T1.printTeacher();
		
		System.out.println();
		T2.TeachId(1007);
		T2.TeachDept("Pathology");
		T2.printTeacher();
		
		System.out.println();
		
		T3.TeachId(1049);
		T3.TeachDept("Agronomy");
		T3.printTeacher();
		
		System.out.println();
		T4.TeachId(1024);
		T4.TeachDept("Economics");
		T4.printTeacher();
		System.out.println();
		
		Student s1= new Student("Roony");
		Obj1.AddSingleStudent();
		Obj1.removeSingleStudent();
		Student s2=new Student("Beena");
		Obj1.AddSingleStudent();
		Student s3=new Student("Mala");
		Obj2.AddSingleStudent();
		Student s4= new Student("Bala");
		Obj2.AddSingleStudent();
		
		s1.stuId(101);
		s1.stuDept("Agronomy");
		s1.stuGrade('A');
		s1.printStudent();
		
		System.out.println();
		
		s2.stuId(102);
		s2.stuDept("Economics");
		s2.stuGrade('E');
		s2.printStudent();
		
		System.out.println();
		
		s3.stuId(103);
		s3.stuDept("Entomology");
		s3.stuGrade('D');
		s3.printStudent();
		
		System.out.println();
		
		s4.stuId(105);
		s4.stuDept("Entomology");
		s4.stuGrade('D');
		s4.printStudent();
		
		
		System.out.println("Total No.of Students in "+Obj1.name+Obj1.getStudents());
		
		System.out.println(Obj2.getStudents());
		
		System.out.println(Obj1.getTeachers());
		System.out.println(Obj2.getTeachers());
		
		System.out.println();
		
		//TODO Print the toString method in school. Such as, school.toString()
		
		//TODO Print any other variables that make sense for a school. Be creative.
		
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
	}

}
