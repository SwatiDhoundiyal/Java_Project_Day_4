package in.ac.sharda;

public class Demo3 {

	public static void main(String[] args) {
		
		IResultArrivedListener iral =  new Student(1, "Swati", null); 
        
		iral.resultArrived();

        iral = new Department(1); 
			 
        iral.resultArrived();

//same iral can be used with both Student & Department
        //this is an example of decoupling
	}

}
