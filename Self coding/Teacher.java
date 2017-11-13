
public class Teacher {
	String Name;
	int TeacherId;
    String Department;
   
public Teacher(String Name) {
     this.Name=Name;
}
public void TeachId(int TeachId) {
	TeacherId= TeachId;
}
public void TeachDept(String TeachDept) {
	Department=TeachDept;
}

public void printTeacher() {
	System.out.println("Name:"+ Name);
	System.out.println("TeacherId:"+ TeacherId);
	System.out.println("Department:"+ Department);
	
}
}
