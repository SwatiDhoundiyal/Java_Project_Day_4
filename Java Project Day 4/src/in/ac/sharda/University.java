package in.ac.sharda;

import java.util.Set;
import java.util.TreeSet;

public class University {
    private Set<Department> departments = new TreeSet<>();
    /*public void addDepartment(Department dept){
     this.departments.add(dept);
     }
      */
    
   

	public boolean addDepartment(Department d) {
		return departments.add(d);
	}
	public void  printDepartment() {
    	departments.parallelStream()
    	.forEach(s -> System.out.println(s.getDeptId()));
    	}
	
		public void resultDeclared() {
			for(Department d: departments) {
				d.resultArrived();
			}
			
		
		}

}  
    
    

