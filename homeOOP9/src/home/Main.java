package home;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args)  {
		

List <Student> student = new ArrayList(); 
				
		Student student1 = new Student("NAME1", "GLASTNAME1", Gender.Man, 1, "OOP1");
		Student student2 = new Student("NAME1", "GLASTNAME2", Gender.Man, 2, "OOP1");
		Student student3 = new Student("NAME3", "VLASTNAME3", Gender.Man, 3, "OOP1");
		Student student4 = new Student("NAME3", "BLASTNAME4", Gender.Man, 4, "OOP1");
		Student student5 = new Student("NAME5", "LASTNAME5", Gender.Woman, 5, "OOP1");
		Student student6 = new Student("NAME6", "NLASTNAME6", Gender.Woman, 6, "OOP1");
		Student student7 = new Student("NAME7", "LASTNAME7", Gender.Man, 7, "OOP1");
		Student student8 = new Student("NAME8", "VLASTNAME8", Gender.Woman, 8, "OOP1");
		Student student9 = new Student("NAME9", "VLASTNAME9", Gender.Man, 9, "OOP1");
		
		

		Group group = new Group();
		group.addStudent(student1);
		group.addStudent(student2);
		group.addStudent(student3);
		group.addStudent(student4);
		group.addStudent(student5);
		group.addStudent(student6);
		group.addStudent(student7);
		group.addStudent(student8);
		group.addStudent(student9);
		
		 
		
		try {
			Student st =  group.searchStudentByLastName("GLASTNAME1");
		System.out.println("Такой студент есть " + st.getLastName()); 
		} catch (StudentNotFoundException s) {
			System.out.println(s.getMessage());
		}
		System.out.println(group.removeStudentByID(1)); 
		group.sortStudentsByLastName();
		group.show();
		Group group1 = new Group("OOP", student);
	

		GropeFileStorege gfs = new GropeFileStorege();
		Group save = new Group();
		
		try {
			gfs.saveGroupToCSV(group1);
		} catch (IOException e) {
			e.printStackTrace();
		}
		File file = new File("OOP.csv");

		try {
			save = gfs.loadGroupFromCSV(file);
		
			System.out.println(save);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	
		
		File search = new File("E:\\Prog_kiev\\homeOOP33");
		File searchResult =gfs.findFileByGroupName("OOP", search);
		if(searchResult!=null) {
		System.out.println(searchResult.getName());
		} else {
			System.out.println("not found");
		}
		
}

}
