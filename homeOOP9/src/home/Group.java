package home;
import java.io.UTFDataFormatException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Group {
	private String groupName;
	private List <Student> student = new ArrayList<>();

	
	Group() {
		super();
		// TODO Auto-generated constructor stub
	}
	Group(String groupName, List<Student> student) {
		super();
		this.groupName = groupName;
		this.student = student;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}
	
	@Override
	public String toString() {
		show();
		return "Group [groupName=" + groupName + ", Student=" + student + "]";
	}
	
	public void addStudent(Student student) {
	
		this.student.add(student);
		System.out.println("Studend add  " + student.getLastName());
				System.out.println();
	}
	public Student searchStudentByLastName(String lastName) throws StudentNotFoundException{
		for (Student student1 : student) {
			if(student1.getLastName().equals(lastName));
			return student1; 
		}
		throw new StudentNotFoundException("StudentNotFound");
	}
	
	
	public boolean removeStudentByID(int id) {
		
		
		for (Student student1 : student) {
			if(student1.getId() == id) { 
		 int index =  student.lastIndexOf(student1);	
		 student.remove(index);
				System.out.println("Studend remove" + student1.getLastName());
				
			return true;
			}
		}
		return false;
	}

	
	public void sortStudentsByLastName(){
		Collections.sort(student, Comparator.nullsFirst(new StudentLastnameComparator()));
	}
	public void show(){
		
		System.out.println();
		for (Student student1 : student) {
			
			System.out.println(student1.getName() + " " + student1.getLastName());
		}

	}
	@Override
	public int hashCode() {
		return Objects.hash(groupName, student);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Group other = (Group) obj;
		return Objects.equals(groupName, other.groupName) && Objects.equals(student, other.student);
	}
	public String equelsStudent(Student st) {
		for (Student student1 : student) {
			if(st!=null && st.equals(student1)) {
		
				return "Такой студент есть";
			}
		}
		return " ";
		
	}
}