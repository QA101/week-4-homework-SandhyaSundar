
public class Student {
	String Name;
	int StudentId;
    String Department;
    char Grade;

                                                                                                                   
public Student(String Name) {
     this.Name=Name;
}
public void stuId(int stuId) {
	StudentId= stuId;
}
public void stuDept(String stuDept) {
	Department=stuDept;
}
public void stuGrade(char stuGrade) {
	Grade =stuGrade;
}
public void printStudent() {
	System.out.println("Name:"+ Name);
	System.out.println("StudentId:"+ StudentId);
	System.out.println("Department:"+ Department);
	System.out.println("Grade:"+ Grade);
}
}