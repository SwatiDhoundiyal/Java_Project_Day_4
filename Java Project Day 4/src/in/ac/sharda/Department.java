package in.ac.sharda;

import java.util.ArrayList;
import java.util.List;

public  class Department implements Comparable<Department>, IResultArrivedListener {
	private final int deptId;
	private List<Student> students = new ArrayList<>();
	
	public Department(int id){
		this.deptId = id;
	}
	
	public void addStudent(Student student) {
		this.students.add(student);
		}
	public void printStudent() {
		 students.parallelStream()
		.forEach(s -> 
				System.out.println(s.getRollnumber()));
	}
	public int getDeptId() {
		return deptId;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof  Department) {
			return((Department)obj).getDeptId()==deptId;
		}
		return false;
	}
	
	@Override
	public int compareTo(Department o) {
		   return o.getDeptId() -deptId;
	}
	
	
	@Override
	public void resultArrived() {
		students.parallelStream().forEach(
				s -> s.resultArrived());
	}
}
		
		
	
