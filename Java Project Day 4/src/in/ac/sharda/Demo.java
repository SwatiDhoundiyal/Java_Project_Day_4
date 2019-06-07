package in.ac.sharda;

public class Demo {

	public static void main(String[] args) {
		Student s = new Student(1,"Swati","swati@1234");
		Student s2 = new Student(2,"Akshat","akshat@123");
		System.out.println(s.getRollnumber());
		System.out.println(s.getName());
		System.out.println(s.getEmail());
		System.out.println(s2.getRollnumber());
		System.out.println(s2.getName());
		System.out.println(s2.getEmail());

	}

}
