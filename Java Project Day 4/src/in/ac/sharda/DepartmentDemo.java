package in.ac.sharda;

public class DepartmentDemo {

	public static void main(String[] args) {
		
		Department d = new Department(2);
		
		d.addStudent(new Student(1,"Swati" ,"swati@123"));
		d.addStudent(new Student(2,"Simran" ,"simran@123"));
		
		d.printStudent();
		
	}
		

}
