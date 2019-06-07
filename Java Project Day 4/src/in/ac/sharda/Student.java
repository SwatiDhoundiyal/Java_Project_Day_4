package in.ac.sharda;

public class Student implements IResultArrivedListener {
	//object state
	private final int rollnumber;
	private final String name;
	private String email;
	
	//constructor
	public Student(int rn,String n, String email) {
		this.rollnumber = rn;
		this.name = n;
		this.email = email;
	
	}
	//object behavior
	public void attendence() {
		System.out.println("Marks Attendence");
	}
	
public int getRollnumber() {
	return rollnumber;
}
/*no setter method for final variables... public void setRollNumber(int rn){
 this.rollNumber=rn;
 }
 */

public String getEmail() {
	return email;
}
public String getName() {
	return name;
}

public void setEmail(String email) {
	this.email = email;
}

@Override
public boolean equals(Object obj) {
	if(obj instanceof Student) {
	    return ((Student)obj)
	    	.getRollnumber() == rollnumber;
	}
	return false;
	
}

@Override
public void resultArrived() {
	// TODO Auto-generated method stub
	System.out.println("result just arriveed");
}


}


