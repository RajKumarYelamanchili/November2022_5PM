package December1st;

public class StaticVariableExample {

	static  String collegeName = "ABC college";
	
	void displayStudentInfo(String name,String branch)
	{
		System.out.println("Name of student: " + name);
		System.out.println("Branch name: " + branch);
		System.out.println("CollegeName: " + collegeName );
	}
	
		
	public static void main(String[] args) 
	{
		StaticVariableExample obj = new StaticVariableExample();
		obj.displayStudentInfo("Raj", "Mech");
		obj.displayStudentInfo("Anil", "CS");
		obj.displayStudentInfo("Sunil", "ECE");
		
		
	}

}
